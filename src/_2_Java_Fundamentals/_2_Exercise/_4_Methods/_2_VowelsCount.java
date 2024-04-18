package _15_ExercisesMethods;
import java.util.Scanner;

public class _2_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        System.out.println(vowelsCount(text));
    }

    public static int vowelsCount(String text){
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char first = text.charAt(i);
            if (first == 'a' || first == 'e' || first == 'y' || first == 'u' ||first == 'i' || first == 'o'){
                sum += 1;
            } else if (first == 'A' || first == 'E' || first == 'Y' || first == 'U' ||first == 'I' || first == 'O') {
                sum += 1;
            }
        }
        return sum;
    }

}
