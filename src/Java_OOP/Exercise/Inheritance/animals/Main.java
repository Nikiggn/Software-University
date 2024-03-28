package Java_OOP.Exercise.Inheritance.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!"Beast!".equals(command)) {
            String com = scanner.nextLine();

            String[] parts = com.split("\\s+");

            String name = parts[0];
            int age = Integer.parseInt(parts[1]);
            String gender = parts[2];

            try {
                switch (command) {
                    case "Cat":
                        Cat cat = new Cat(name, age, gender);
                        System.out.printf("%s%n", cat);
                        break;
                    case "Dog":
                        Dog dog = new Dog(name, age, gender);
                        System.out.printf("%s%n", dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(name, age, gender);
                        System.out.printf("%s%n", frog);
                        break;
                    case "Kittens":
                        Kitten kitten = new Kitten(name, age);
                        System.out.printf("%s%n", kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(name, age);
                        System.out.printf("%s%n", tomcat);
                        break;
                }
            } catch (IllegalArgumentException exception) {
                System.out.printf("%s%n", exception.getMessage());
            }

            command = scanner.nextLine();
        }
    }
}
