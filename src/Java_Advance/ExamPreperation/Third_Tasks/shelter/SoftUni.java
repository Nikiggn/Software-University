package Java_Advance.ExamPreperation.Third_Tasks.shelter;

import java.util.ArrayList;
import java.util.List;

public class SoftUni {
    private int capacity;
    private List<Student> data;


    public SoftUni(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public int 	getCount(){
        return this.data.size();
    }



}
