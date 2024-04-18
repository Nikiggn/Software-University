package _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites;

import _4_Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.Interfaces.AddRemovable;

public class AddRemoveCollection extends Collection implements AddRemovable {

    @Override
    public String remove() {
        return super.removeLast();
    }

    @Override
    public int add(String name) {
        super.addFirst(name);
        return 0;
    }
}
