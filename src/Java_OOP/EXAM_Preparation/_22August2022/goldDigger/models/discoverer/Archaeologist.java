package Java_OOP.EXAM_Preparation._22August2022.goldDigger.models.discoverer;

public class Archaeologist extends  BaseDiscoverer{
    private  static final double DEFAULT_ENERGY = 60;

    protected Archaeologist(String name) {
        super(name,DEFAULT_ENERGY);
    }
}
