import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        for (int i = 0; i < name.length()  ; i++) {
            System.out.println(name.charAt(i));

        }

    }
}
