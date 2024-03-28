package Not_Finished.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;


    protected Mammal(String animalName, String animalType, double animalWeight, int foodEaten,String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion(){
        return this.livingRegion;
    }


    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",getClass().getSimpleName(), super.getAnimalName(), decimalFormat.format(super.getAnimalWeight()), this.livingRegion ,super.getFoodEaten());
    }


}
