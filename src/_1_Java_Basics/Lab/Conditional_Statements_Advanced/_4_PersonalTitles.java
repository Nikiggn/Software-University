import java.util.Scanner;

public class _4_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double year = Double.parseDouble(scanner.nextLine());
        String gende = scanner.nextLine();

        if (gende.equals("f")){
            if (year <16){
                System.out.println("Miss");
            }else {
                System.out.println("Ms.");
            }
        }else {
            if (year<16){
                System.out.println("Master");
            }else {
                System.out.println("Mr.");
            }
        }
    }
}
