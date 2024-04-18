import java.util.Scanner;
public class _6_ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String secondname = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.",
                name, secondname, years, grad);
    }
}
