package Java_OOP.EXAM_Preparation._19_December_2023.climbers.core;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber.RockClimber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climber.WallClimber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climbing.Climbing;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.climbing.ClimbingImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.mountain.Mountain;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.models.mountain.MountainImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.repositories.ClimberRepository;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.repositories.MountainRepository;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.repositories.Repository;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.common.ConstantMessages;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers.common.ExceptionMessages;


public class ControllerImpl implements Controller {

    private Repository<Climber> climberRepository;
    private Repository<Mountain> mountainRepository;
    private int mountainsCount;

    public ControllerImpl() {
        this.climberRepository = new ClimberRepository();
        this.mountainRepository = new MountainRepository();
        this.mountainsCount = 0;
    }

    @Override
    public String addClimber(String type, String climberName) {
        Climber climber;
        if (type.equals("RockClimber")) {
            climber = new RockClimber(climberName);
        } else if (type.equals("WallClimber")) {
            climber = new WallClimber(climberName);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.CLIMBER_INVALID_TYPE);
        }
        this.climberRepository.add(climber);
        return String.format(ConstantMessages.CLIMBER_ADDED, type, climberName);
    }

    @Override
    public String addMountain(String mountainName, String... peaks) {
        Mountain mountain = new MountainImpl(mountainName);
        for (String peak : peaks) {
            mountain.getPeaksList().add(peak);
        }
        this.mountainRepository.add(mountain);
        return String.format(ConstantMessages.MOUNTAIN_ADDED, mountainName);
    }

    @Override
    public String removeClimber(String climberName) {
        Climber climber = this.climberRepository.byName(climberName);
        if (climber == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.CLIMBER_DOES_NOT_EXIST, climberName));
        }
        this.climberRepository.remove(climber);
        return String.format(ConstantMessages.CLIMBER_REMOVE, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {
        if (this.climberRepository.getCollection().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.THERE_ARE_NO_CLIMBERS);
        }
        Mountain mountain = this.mountainRepository.byName(mountainName);
        Climbing climbing = new ClimbingImpl();
        climbing.conqueringPeaks(mountain, this.climberRepository.getCollection());
        int removedClimbers = 0;
        for (Climber climber : climberRepository.getCollection()) {
            if (climber.getStrength() == 0) {
                removedClimbers++;
            }
        }
        this.mountainsCount++;
        return String.format(ConstantMessages.PEAK_CLIMBING, mountainName, removedClimbers);
    }

    @Override
    public String getStatistics() {
        StringBuilder str = new StringBuilder();
        str.append(String.format(ConstantMessages.FINAL_MOUNTAIN_COUNT, this.mountainsCount)).append(System.lineSeparator());
        str.append(ConstantMessages.FINAL_CLIMBERS_STATISTICS).append(System.lineSeparator());

        for (Climber climber : climberRepository.getCollection()) {
            str.append(String.format(ConstantMessages.FINAL_CLIMBER_NAME, climber.getName())).append(System.lineSeparator());
            str.append(String.format(ConstantMessages.FINAL_CLIMBER_STRENGTH, climber.getStrength())).append(System.lineSeparator());
            if (climber.getRoster().getPeaks().isEmpty()) {
                str.append(String.format(ConstantMessages.FINAL_CLIMBER_PEAKS, "None")).append(System.lineSeparator());
            } else {
                str.append(String.format(ConstantMessages.FINAL_CLIMBER_PEAKS, String.join(ConstantMessages.FINAL_CLIMBER_FINDINGS_DELIMITER, climber.getRoster().getPeaks()))).append(System.lineSeparator());
            }
        }

        return str.toString().trim();
    }
}
