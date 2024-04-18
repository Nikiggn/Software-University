package _35_FinalExamPreparation;

import java.util.Scanner;

public class _1_PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();

        StringBuilder newText = new StringBuilder();

        while (true){
            String com = scanner.nextLine();
            if (com.equals("Done")){
                break;
            }

            String[] parts = com.split(" ");
            String order = parts[0];
            switch (order){
                case "TakeOdd":

                    for (int i = 0; i < text.length() ; i++) {
                        char[] chars = text.toCharArray();
                        if (i % 2 != 0){
                            newText.append(chars[i]);
                        }
                    }
                    System.out.println(newText);
                    break;

                case "Cut":
                    int index = Integer.parseInt(parts[1]);
                    int length = Integer.parseInt(parts[2]);

                    newText.replace(index, index + length, "");
                    System.out.println(newText);

                    break;
                case "Substitute":
                    String substring = parts[1];
                    String substitute  =parts[2];

                    while (true){
                        int indexvvv =newText.indexOf(substring);
                        int last = newText.lastIndexOf(substring);

                        newText.replace(indexvvv, last, substitute);

                        break;
                    }
                    break;
            }
        }
        System.out.println(newText);
    }
}
