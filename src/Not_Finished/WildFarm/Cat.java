package Not_Finished.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String breed;


    protected Cat(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.print("Meowwww\n");

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %s, %d]",getClass().getSimpleName(), super.getAnimalName(), this.breed, decimalFormat.format(super.getAnimalWeight()), super.getLivingRegion() ,super.getFoodEaten());
    }
}
