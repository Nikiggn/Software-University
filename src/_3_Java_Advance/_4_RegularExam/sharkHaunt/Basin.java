package _3_Java_Advance._4_RegularExam.sharkHaunt;

import java.util.ArrayList;
import java.util.List;

public class Basin {
    private String name;
    private int capacity;

    private List<Shark> sharks;


    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    public void addShark(Shark shark){
        if (this.sharks.size() < capacity){
            this.sharks.add(shark);
        }else {
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind){
        for (Shark shark: this.sharks) {
            if (shark.getKind().equals(kind)){
                return this.sharks.remove(shark);
            }

        }
        return false;
    }

    public Shark getLargestShark(){
        Shark largest = null;
        for (Shark shark: this.sharks) {
            if (largest == null){
                largest = shark;
            }

            if (largest.getLength() < shark.getLength()){
                largest = shark;
            }
        }
        return largest;
    }

    public Shark getShark(String kind){
        for (Shark shark:this.sharks) {
            if (shark.getKind().equals(kind)){
                return shark;
            }
        }
        return null;
    }

    public int getCount(){
        return this.sharks.size();
    }

    public int getAverageLength(){
        int sumLength = 0;
        for (Shark shark:this.sharks) {
            sumLength += shark.getLength();
        }

        return sumLength/this.sharks.size();
    }

    public String report(){
        StringBuilder result = new StringBuilder();
        result.append("Sharks in ").append(name).append(":\n");

        for (Shark shark : sharks) {
            result.append("The ").append(shark.getKind()).append(" is ")
                    .append(shark.getLength()).append(" centimeters long, eats ")
                    .append(shark.getFood()).append(" and inhabits ")
                    .append(shark.getHabitation()).append(".\n");
        }

        return result.toString();
    }

}
