package _35_FinalExamPreparation;

import java.util.Scanner;

public class _1_WorldTour {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         String stops = scanner.nextLine();
         while(true){
             String line = scanner.nextLine();
             if (stops.equals("Travel")){
                 break;
             }

             String orders = line.split(":")[0];

             switch (orders){
                 case "Add Stop":
                     int index = Integer.parseInt(line.split(":")[1]);
                     String stop = line.split(":")[2];
                   //  if (isValidIdx())
                     break;
                 case "Remove Stop":
                     break;
                 case "Switch":
                     break;
             }
         }
    }

    private  static boolean isValidIdx(int idx, String str){
        return idx >= 0 && idx <= str.length() ;
    }
}
