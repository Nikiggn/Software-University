package Not_Finished.birthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> birthDates = new ArrayList<>();

        String command = scanner.nextLine();
        while (!"End".equals(command)) {
            String[] parts = command.split("\\s+");

            switch (parts[0]) {
                case "Citizen":
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    String id = parts[3];
                    String birthDate = parts[4];
                    birthDates.add(birthDate);

                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    break;
                case "Robot":
                    String model = parts[1];
                    String idRobot = parts[2];

                    Robot robot = new Robot(model, idRobot);
                    break;
                case "Pet":
                    String namePet = parts[1];
                    String birthDatePet = parts[2];
                    birthDates.add(birthDatePet);

                    Pet pet = new Pet(namePet, birthDatePet);
                    break;
            }
            command = scanner.nextLine();
        }

        String year = scanner.nextLine();

        for (String date : birthDates) {
            String[] dateParts = date.split("/");
            if (dateParts[2].equals(year)){
                System.out.println(date);
            }
        }
    }
}
