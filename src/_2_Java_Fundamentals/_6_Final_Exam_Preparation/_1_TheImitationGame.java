package _35_FinalExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _1_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> mess = new java.util.ArrayList<>
                (Arrays.stream(scanner.nextLine().split(""))
                        .toList());


        while (true) {
            String command = scanner.nextLine();
            if (command.equals("Decode")) {
                break;
            }

            String order = command.split("\\|")[0];
            switch (order) {
                case "Move":
                    int nums = Integer.parseInt(command.split("\\|")[1]);

                    for (int i = 1; i <= nums; i++) {
                        String symbol = mess.get(0);
                        mess.remove(symbol);
                        mess.add(symbol);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(command.split("\\|")[1]);
                    String value = command.split("\\|")[2];
                    if (index > mess.size()){
                        mess.add(value);
                    }else {
                        mess.add(index, value);
                    }

                    break;

                case "ChangeAll":
                    String substring = command.split("\\|")[1];
                    String repl = command.split("\\|")[2];

                    int s = 0;

                    for (String el1 : mess) {
                        if (el1.equals(substring)) {
                            s += 1;
                        }
                    }
                    for (int i = 1; i <= s; i++) {
                        int indexxxx = mess.indexOf(substring);
                        mess.remove(substring);
                        mess.add(indexxxx, repl);
                    }

                    break;
            }

        }

            System.out.printf("The decrypted message is: %s", String.join("", mess));

    }
}
