package Not_Finished.WildFarm;

public class Zebra extends Mammal {

    protected Zebra(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.print("Zs\n");
    }

    @Override
    public void eat(Food food) {

    }
}
