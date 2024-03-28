package Not_Finished.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] parts = input.split(" ");

            String animalType = parts[0];
            String name = parts[1];
            double weight = Double.parseDouble(parts[2]);
            String livingRegion = parts[3];

            String[] parts2 = scanner.nextLine().split(" ");

            String foodType = parts2[0];
            int foodEaten = Integer.parseInt(parts2[1]);

            switch (animalType) {
                case "Mouse":
                    Mouse mouse = new Mouse(name, animalType, weight, foodEaten, livingRegion);
                    mouse.makeSound();
                    if (!foodType.equals("Vegetable")) {
                        System.out.println("Mouses are not eating that type of food!");
                    }
                    System.out.println(mouse);
                    break;

                case "Tiger":
                    Tiger tiger = new Tiger(name, animalType, weight, foodEaten, livingRegion);
                    tiger.makeSound();
                    if (!foodType.equals("Meat")) {
                        System.out.println("Tigers are not eating that type of food!");
                    }
                    System.out.println(tiger);
                    break;

                case "Cat":
                    String catBreed = parts[4];
                    Cat cat = new Cat(name, animalType, weight, foodEaten, livingRegion, catBreed);
                    cat.makeSound();
                    System.out.println(cat);

                    break;
                case "Zebra":
                    Zebra zebra = new Zebra(name, animalType, weight, foodEaten, livingRegion);
                    zebra.makeSound();
                    if (!foodType.equals("Vegetable")) {
                        System.out.println("Zebras are not eating that type of food!");
                    }
                    System.out.println(zebra);
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
