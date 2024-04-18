package _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites;

import _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.Interfaces.MyList;

public class MyListImpl extends Collection implements MyList {
    @Override
    public String remove() {
        return super.removeFirst();
    }

    @Override
    public int add(String name) {
        super.addFirst(name);
        return 0;
    }

    @Override
    public int getUsed() {
        return super.getItems().size();
    }
}
