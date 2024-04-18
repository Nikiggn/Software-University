package _20_RegularMidEXAM;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true){
            String commands = scanner.nextLine();
            if (commands.equals("Finish")){ // да върви цикъла
                break;
            }
            String[] newComand = commands.split(" ");

            String order = newComand[0];
            int num = Integer.parseInt(newComand[1]);

            switch (order){
                case "Add":
                    numbers.add(num);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(num));
                    break;
                case "Replace":
                    int num2 = Integer.parseInt(newComand[2]);
                    int index = numbers.indexOf(num);
                    numbers.set(index, num2);
                    break;
                case "Collapse":
                    for (int i = numbers.size() - 1; i >= 0 ; i--) { // проверка за всеки ел от Листа
                        int el1 = numbers.get(i);
                        if (el1 < num){
                            numbers.remove(i);
                        }
                    }
                    break;
            }
        }

        // принтваме листа

        for (int el2: numbers) {
            System.out.print(el2 + " ");
        }



    }
}
