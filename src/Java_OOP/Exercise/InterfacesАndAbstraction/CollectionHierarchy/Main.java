package Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy;

import Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.Interfaces.AddRemovable;
import Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.Interfaces.Addable;
import Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites.AddCollection;
import Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites.AddRemoveCollection;
import Java_OOP.Exercise.InterfacesАndAbstraction.CollectionHierarchy.entites.MyListImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        printIndexes(addCollection, parts);
        printIndexes(addRemoveCollection, parts);
        printIndexes(myList,parts);

        int removeOperations = Integer.parseInt(scanner.nextLine());

        printRemoved(addRemoveCollection, removeOperations);
        printRemoved(myList,removeOperations);
    }

    private static void printRemoved(AddRemovable collection, int removeOperations){
        for (int i = 0; i < removeOperations; i++) {
            System.out.print(collection.remove() + " ");
        }
        System.out.println();
    }
    private static void printIndexes(Addable addCollection, String[] input) {
        for (String item : input) {
            System.out.print(addCollection.add(item) + " ");
        }
        System.out.println();
    }
}
