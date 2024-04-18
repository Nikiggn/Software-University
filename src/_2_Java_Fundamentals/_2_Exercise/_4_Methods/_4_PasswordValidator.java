package _15_ExercisesMethods;
import java.util.Scanner;

public class _4_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

    }

    public static String checkPassword(String password){
        int characters = password.length();
        String result  = "";
        if (characters < 6 || characters > 10){
            result = "Password must be between 6 and 10 characters";
        }
        return result;
    }
}
