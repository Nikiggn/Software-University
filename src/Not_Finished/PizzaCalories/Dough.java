package Not_Finished.PizzaCalories;

import java.util.Map;

public class Dough {

    private static final int BASE_CALORIES = 2;
    private  static final Map<String, Double> MODIFIERS = Map.of(
            "White", 1.5,
            "Wholegrain", 1.0);
    private static final Map<String, Double> BACKING = Map.of(
            "Crispy", 0.9,
            "Chewy", 1.1,
            "Homemade",1.0);

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    public double getWeight() {
        return weight;
    }
    public String getBakingTechnique() {
        return bakingTechnique;
    }
    public double calculateCalories(){
        return  BASE_CALORIES
                * this.weight
                * MODIFIERS.get(this.flourType)
                * BACKING.get(this.bakingTechnique);
    }

    private void setFlourType(String flourType) {
        if (!MODIFIERS.containsKey(flourType)){
            throw new IllegalArgumentException("Invalid type of dough");
        }
        this.flourType = flourType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
            this.weight = weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!BACKING.containsKey(bakingTechnique)){
            throw  new IllegalArgumentException("Invalid type of dough");
        }
        this.bakingTechnique = bakingTechnique;
    }


}
