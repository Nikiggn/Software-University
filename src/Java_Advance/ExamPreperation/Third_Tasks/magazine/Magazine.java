package Java_Advance.ExamPreperation.Third_Tasks.magazine;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String type;
    private int capacity;

    private List<Cloth> data;


    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void  addCloth(Cloth cloth){
        if (this.data.size() < capacity){
            this.data.add(cloth);
        }
    }

    public  boolean removeCloth(String color){
        for (Cloth cloth: this.data) {
            if (cloth.getColor().equals(color)){
                return this.data.remove(cloth);
            }
        }
        return false;
    }

    public Cloth getSmallestCloth(){
        Cloth getSmallestCloth = null;
        for (Cloth datum : this.data) {
            if (getSmallestCloth == null) {
                getSmallestCloth = datum;
            } else if (datum.getSize() < getSmallestCloth.getSize()) {
                getSmallestCloth = datum;
            }
        }
        return getSmallestCloth;
    }

    public Cloth getCloth(String color){
        for (Cloth cloth: this.data) {
            if (cloth.getColor().equals(color)){
                return cloth;
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String report() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(this.type).append(" magazine contains:\n");

        for (Cloth cloth : this.data) {
            reportBuilder.append(cloth).append("\n");
        }

        return reportBuilder.toString();
    }


}
