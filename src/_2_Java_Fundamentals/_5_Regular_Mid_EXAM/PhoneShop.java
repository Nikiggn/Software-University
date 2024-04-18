package _20_RegularMidEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> storage = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        while (true){
            String command = scanner.nextLine();
            if (command.equals("End")) {
                break;
            }

            String[] com = command.split(" - ");
            String order = com[0];
            String phone = com[1];

            switch (order){
                case "Add":
                    if (!storage.contains(phone)){
                        storage.add(phone);
                    }
                    break;
                case "Remove":
                    if (storage.contains(phone)){
                        storage.remove(phone);
                    }
                    break;
                case "Bonus phone":
                    String[] newCom = phone.split(":");
                    String oldPhone = newCom[0]; // това си е phone
                    String newPhone = newCom[1];

                    if (storage.contains(oldPhone)) { // prowerka дали съществува
                        int index = storage.indexOf(phone);// търсим индекса на стария тел
//                        storage.remove(oldPhone);
//                        storage.add(index - 1, oldPhone);
                        storage.add(index + 3, newPhone);// добавяме новия тел от горния индекс
                    }
                    break;
                case "Last":
                    if (storage.contains(phone)){
                        storage.remove(phone);
                        storage.add(phone);
                    }
                    break;
            }

        }
        System.out.println(String.join(", ", storage));
    }
}
