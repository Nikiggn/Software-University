package Not_Finished.WildFarm;

public class Tiger extends Felime{
    String livingRegion;

    protected Tiger(String animalName, String animalType, double animalWeight, int foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.print("ROAAR!!!\n");
    }

    @Override
    public void eat(Food food) {

    }
}
