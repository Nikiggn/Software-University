package _3_Java_Advance._3_ExamPreperation._3_OOP.Rabbits;

public class Rabbit {
    private String name;
    private String species;
    private boolean available;


    public Rabbit(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return String.format("Rabbit (%s): %s", getSpecies(), getName());
    }
}
