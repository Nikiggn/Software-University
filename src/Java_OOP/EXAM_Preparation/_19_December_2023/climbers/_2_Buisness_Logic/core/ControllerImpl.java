package Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.core;

import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber.Climber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber.RockClimber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climber.WallClimber;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climbing.Climbing;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.climbing.ClimbingImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.mountain.Mountain;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.models.mountain.MountainImpl;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.repositories.ClimberRepository;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.repositories.MountainRepository;
import Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.repositories.Repository;

import java.util.Collection;

import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.common.ConstantMessages.CLIMBER_ADDED;
import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.common.ConstantMessages.*;
import static Java_OOP.EXAM_Preparation._19_December_2023.climbers._2_Buisness_Logic.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private final Repository<Climber> climberRepository;
    private final MountainRepository mountainRepository;
    private int mountainCount;

    public ControllerImpl() {
        this.climberRepository = new ClimberRepository();
        this.mountainRepository = new MountainRepository();
        this.mountainCount = 0;
    }

    @Override
    public String addClimber(String type, String climberName) {
        Climber climber;
        if (type.equals("RockClimber")) {
            climber = new RockClimber(climberName);
        } else if (type.equals("WallClimber")) {
            climber = new WallClimber(climberName);
        } else {
            throw new IllegalArgumentException(CLIMBER_INVALID_TYPE);
        }
        this.climberRepository.add(climber);
        return String.format(CLIMBER_ADDED, type, climberName);
    }

    @Override
    public String addMountain(String mountainName, String... peaks) {
        Mountain mountain = new MountainImpl(mountainName);
        this.mountainRepository.add(mountain);
        return String.format("Added Mountain: %s.", mountainName);

    }

    @Override
    public String removeClimber(String climberName) {
        Climber climber = this.climberRepository.byName(climberName);
        if (climber == null){
            throw new IllegalArgumentException(String.format(CLIMBER_DOES_NOT_EXIST, climberName));
        }
        this.climberRepository.remove(climber);
        return String.format(CLIMBER_REMOVE, climberName);
    }

    @Override
    public String startClimbing(String mountainName) {
        Collection<Climber> climbers = this.climberRepository.getCollection();
        if (climbers.isEmpty()) {
            throw new IllegalArgumentException(THERE_ARE_NO_CLIMBERS);
        }
        Mountain mountain = this.mountainRepository.byName(mountainName);
        Climbing climbing = new ClimbingImpl();
        climbing.conqueringPeaks(mountain, climbers);
        int removedClimbers = 0;
        for (Climber climber : climbers) {
            if (climber.getStrength() == 0) {
                removedClimbers++;
            }
        }
        this.mountainCount++;
        return String.format(PEAK_CLIMBING, mountainName, removedClimbers);
    }

    @Override
    public String getStatistics() {
        StringBuilder statistics = new StringBuilder();
        statistics.append(String.format(FINAL_MOUNTAIN_COUNT, this.mountainCount)).append(System.lineSeparator());
        statistics.append(String.format(FINAL_CLIMBERS_STATISTICS)).append(System.lineSeparator());
        for (Climber climber : this.climberRepository.getCollection()) {
            statistics.append(String.format(FINAL_CLIMBER_NAME, climber.getName())).append(System.lineSeparator());
            statistics.append(String.format(FINAL_CLIMBER_STRENGTH, climber.getStrength())).append(System.lineSeparator());
            if (climber.getRoster().getPeaks().isEmpty()) {
                statistics.append(String.format(FINAL_CLIMBER_PEAKS, "None")).append(System.lineSeparator());
            } else {
                statistics.append(String.format(FINAL_CLIMBER_PEAKS, String.join(FINAL_CLIMBER_FINDINGS_DELIMITER, climber.getRoster().getPeaks()))).append(System.lineSeparator());
            }
        }
        return statistics.toString().trim();    }
}
