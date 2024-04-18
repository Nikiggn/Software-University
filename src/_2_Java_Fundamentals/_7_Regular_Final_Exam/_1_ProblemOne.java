package _38_RegulaFinalExam;

import java.util.Scanner;

public class _1_ProblemOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        StringBuilder newnew = new StringBuilder(input);


        while (true){
            String command = scanner.nextLine();
            if (command.equals("Done")){
                break;
            }

            String[] parts = command.split(" ");

            String order = parts[0];

            switch (order){
                case "Change":
                    String  toReplace = parts[1];
                    String replacement = parts[2];

                    input = input.replaceAll(toReplace, replacement);
                    System.out.println(input);
                    break;

                case "Includes":
                    String substring = parts[1];

                    if (input.contains(substring)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case "End":
                    String substringNew = parts[1];

                    if (input.endsWith(substringNew)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;

                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String ch = parts[1];
                    System.out.println(input.indexOf(ch));
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(parts[1]);
                    int count= Integer.parseInt(parts[2]);
                    input = input.substring(startIndex, startIndex + count);
                    System.out.println(input);

                    break;
            }

        }
    }
}
