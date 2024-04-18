package _2_Java_Fundamentals._2_Exercise._1_Basic;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double money =  Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaber = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double  studentForLight = Math.ceil(students + students * 0.1);
        double lightsaber1 = studentForLight * lightsaber;

        double robes = robesPrice * students;
        double belts1 = (students - students / 6)* beltsPrice;

        //if (students >= 6){
             //belts1 = Math.abs((students - (double) students /6) * beltsPrice);
        //}else {
            //belts1 = students * beltsPrice;
        //}

        double whole = lightsaber1 + robes + belts1;

        if (whole <= money){
            System.out.printf("The money is enough - it would cost %.2flv.",whole);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",whole - money);
        }

    }
}
