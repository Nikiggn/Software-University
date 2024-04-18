package _2_Java_Fundamentals._1_Lab._5_Objects_and_Classes;

public class Songs_4_ {
    private String typeList;
    private String name;
    private String time;

    public Songs_4_(String typeList, String name, String time){
        this.typeList = typeList;
        this.name = name;
        this.time = time;
    }


    public String getTypeList(){
        return this.typeList;
    }
    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime(){
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

