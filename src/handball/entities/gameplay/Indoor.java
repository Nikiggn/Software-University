package handball.entities.gameplay;

public class Indoor extends BaseGameplay{
    private  static final int DEFAULT_CAPACITY = 250;

    public Indoor(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}
