package _3_Java_Advance._3_ExamPreperation._3_OOP.Halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private int capacity;
    private List<Kid> data;


    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public  void addKid(Kid kid){
        if (this.data.size() < capacity){
            this.data.add(kid);
        }
    }

    public boolean removeKid(String name){
        for (Kid kid: this.data) {
            if (kid.getName().equals(name)){
                return this.data.remove(kid);
            }
        }
        return false;
    }

    public Kid getKid(String street){
        for (Kid kid:this.data) {
            if (kid.getStreet().equals(street)){
                return kid;
            }
        }
        return null;
    }

    public int getAllKids(){
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Children who visited a house for candy:\n");
        for (Kid datum : this.data) {
            stringBuilder.append(datum.getName() + " from " + datum.getStreet() + " street\n");
        }

        return stringBuilder.toString();
    }
}
