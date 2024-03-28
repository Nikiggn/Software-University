package Not_Finished.animals;

public class Kitten extends Cat{
    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String toString() {
        return "Meow";
    }
}
