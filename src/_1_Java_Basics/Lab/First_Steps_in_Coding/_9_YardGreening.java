import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double metri = Double.parseDouble(scanner.nextLine());
        double price = metri * 7.61;

        double finalprice = price * 0.18;
        double razlika = price -  finalprice;

        //•	"The final price is: {крайна цена на услугата} lv."
        //•	"The discount is: {отстъпка} lv."


        System.out.println("The final price is:" + razlika + " lv");
        System.out.println("The discount is:" + finalprice + " lv");


    }
}
