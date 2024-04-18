package _35_FinalExamPreparation;

import java.util.Scanner;

public class _1_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder newMes = new StringBuilder(message);

        while (true){
            String commands = scanner.nextLine();
            if (commands.equals("Reveal")){
                break;
            }

            String order = commands.split(":\\|:")[0];

            switch (order){
                case "InsertSpace":
                    int index = Integer.parseInt(commands.split(":\\|:")[1]);
                    newMes.insert(index, " ");
                    System.out.println(newMes);
                    break;

                case "Reverse":
                    String substring = commands.split(":\\|:")[1];
                    if (newMes.toString().contains(substring)){

                        int indexStart = newMes.indexOf(substring);
                        newMes.delete(indexStart,indexStart+substring.length()+1);
//                        int lastIndex = newMes.lastIndexOf(substring);
//                        newMes.replace(indexStart, lastIndex, "");

                        String reversed = new StringBuilder(substring).reverse().toString();
                        newMes.append(reversed);
//                        for (int i = substring.length() -1; i >= 0 ; i--) {
//                             char ch = substring.charAt(i);
//                             newMes.append(ch);
//                        }
                        System.out.println(newMes );
                    }else {
                        System.out.println("error");
                    }

                    break;
                case "ChangeAll":
                    String substring1 = commands.split(":\\|:")[1];
                    String newtext = commands.split(":\\|:")[2];
                    newMes = new StringBuilder(newMes.toString().replaceAll(substring1,newtext));

                    System.out.println(newMes);

                    break;
            }
        }
        System.out.println("Ypu have a new text message: " + newMes);
    }
}
