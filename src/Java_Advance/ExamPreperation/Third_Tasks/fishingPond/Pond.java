package Java_Advance.ExamPreperation.Third_Tasks.fishingPond;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    private int capacity;
    private List<Fish> fishes;


    public Pond(int capacity) {
        this.capacity = capacity;
        this.fishes = new ArrayList<>();
    }

    public void addFish(Fish fish){
        if (this.fishes.size() < capacity){
            this.fishes.add(fish);
        }
    }

    public boolean removeFish(String species){
        for (Fish fish: this.fishes) {
            if (fish.getSpecies().equals(species)){
                return this.fishes.remove(fish);
            }
        }
        return false;
    }

    public Fish getOldestFish(){
        Fish oldest = null;

        for (Fish fish:this.fishes) {
            if (oldest == null){
                oldest = fish;
            }
            if (oldest.getAge() < fish.getAge()){
                oldest = fish;
            }
        }
        return oldest;
    }

    public Fish getFish(String species){

        for (Fish fish:this.fishes) {
            if (fish.getSpecies().equals(species)){
                return fish;
            }
        }
        return null;
    }

    public int getCount(){
        return this.fishes.size();
    }

    public int getVacancies(){
        return capacity - this.fishes.size();
    }

    public String report() {
        StringBuilder reportString = new StringBuilder("Fishes in the pond:\n");
        for (Fish fish : fishes) {
            reportString.append("This ").append(fish.getSpecies()).append(" is ").append(fish.getAge())
                    .append(" years old and reproduces through ").append(fish.getMatingSeason()).append(".\n");
        }
        return reportString.toString();
    }
}
