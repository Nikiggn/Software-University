package Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Collection {
    private int maxSize;
    private List<String> items;


    public Collection() {
        this.maxSize = 100;
        this.items = new ArrayList<>();
    }
    public void addLast(String item){
        this.items.add(item);
    }
    public void addFirst(String item){
        this.items.add(0, item);
    }

    protected String removeFirst(){
        return this.items.remove(0);
    }
    protected String removeLast(){
        return this.items.remove(this.items.size() - 1);
    }
    public List<String> getItems() {
        return Collections.unmodifiableList(this.items);
    }

    protected int getMaxSize() {
        return maxSize;
    }

    protected void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }



    protected void setItems(List<String> items) {
        this.items = items;
    }
}
