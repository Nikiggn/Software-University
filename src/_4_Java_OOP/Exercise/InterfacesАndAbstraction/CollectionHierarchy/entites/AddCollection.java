package _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites;

import _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.Interfaces.Addable;

public class AddCollection extends Collection implements Addable {
    @Override
    public int add(String name) {
        super.addLast(name);
        return super.getItems().size() - 1;
    }
}
