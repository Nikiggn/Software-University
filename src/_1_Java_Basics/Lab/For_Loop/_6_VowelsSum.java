import java.util.Scanner;

public class _6_VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = 0;


        String text = scanner.nextLine();
        for (int i = 0; i <text.length()   ; i++) {
            char symbol = text.charAt(i);

            switch (symbol){
                case 'a':
                    point += 1;
                    break;
                case 'o':
                    point += 4;
                    break;
                case 'e':
                    point +=2;
                    break;
                case 'u':
                    point += 5;
                    break;
                case 'i':
                    point += 3;
                    break;

            }

        }

        System.out.println(point);
    }
}
