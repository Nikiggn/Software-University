import java.util.Scanner;

public class _7_ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int hours = project * 3;

        //"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."

        System.out.printf("The architect %s will need %d hours to complete %s project/s.",
                name, hours, project);
    }
}
