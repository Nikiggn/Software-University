package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer;

public class Geologist extends BaseDiscoverer{
    private  static final double DEFAULT_ENERGY = 100;

    protected Geologist(String name) {
        super(name, DEFAULT_ENERGY);
    }
}
