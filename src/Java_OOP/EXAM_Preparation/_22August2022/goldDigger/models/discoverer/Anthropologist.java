package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer;

public class Anthropologist extends  BaseDiscoverer {
    private  static final double DEFAULT_ENERGY = 40;
    protected Anthropologist(String name) {
        super(name, DEFAULT_ENERGY);
    }
}
