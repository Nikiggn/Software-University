package Exercise.Conditional_Statements;

import java.util.Scanner;
public class _8_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int MovieLenght = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double LunchTime = (double) rest / 8;
        double OtdihTime = (double) rest / 4;

        double TimeLeft = rest - (LunchTime + OtdihTime);

        if (TimeLeft >= MovieLenght){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movie,Math.ceil(TimeLeft - MovieLenght));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, Math.ceil(MovieLenght - TimeLeft));
        }
    }
}
