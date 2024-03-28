package Not_Finished.WildFarm;

public class Mouse extends Mammal{

    protected Mouse(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.print("SQUEEEAAAK!\n");
    }

    @Override
    public void eat(Food food) {

    }
}
