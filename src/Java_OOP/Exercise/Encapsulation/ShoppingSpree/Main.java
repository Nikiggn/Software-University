package Java_OOP.Exercise.Encapsulation.ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        String[] people = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");

        fillPersonList(personList, people);
        fillProductsList(productList, products);

        logic(scanner,personList, productList);
    }

    public static void fillPersonList(List<Person> personList, String[] people){
        for (String pep : people) {
            String[] pep1 = pep.split("=");
            Person person = new Person(pep1[0], Double.parseDouble(pep1[1]));
            personList.add(person);
        }
    }

    public static void fillProductsList(List<Product> productList, String[] products){
        for (String prop : products) {
            String[] prop1 = prop.split("=");
            Product product = new Product(prop1[0], Double.parseDouble(prop1[1]));
            productList.add(product);
        }
    }

    public  static void logic(Scanner scanner,List<Person> personList, List<Product> productList){
        String command = scanner.nextLine();
        while (!"END".equals(command)) {
            String[] parts = command.split("\\s+");
            String personName = parts[0];
            String productName = parts[1];

            for (Person person : personList) {
                if (person.getName().equals(personName)) {
                    for (Product product : productList) {
                        if (product.getName().equals(productName)) {
                            person.buyProduct(product);
                        }
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Person person : personList) {
            person.print(person);
        }
    }
}
