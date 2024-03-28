package Java_OOP.EXAM_Preparation._19_December_2023.climbers._1High_Quality_Structure.core;

public interface Controller {
    String addClimber(String type, String climberName);

    String addMountain(String mountainName, String... peaks);

    String removeClimber(String climberName);

    String startClimbing(String mountainName);

    String getStatistics();

}
