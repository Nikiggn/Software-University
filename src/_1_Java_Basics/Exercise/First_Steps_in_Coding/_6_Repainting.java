import java.util.Scanner;
public class _6_Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        //добави още 10% от количеството боя и 2 кв.м. найлон, разбира се и 0.40 лв. за торбички

        //sumata заплаща на майсторите за 1 час работа, е равна на 30% от сбора на всички разходи за материали.

        int quantityNylon = Integer.parseInt(scanner.nextLine());   //  в кв.м
        int quantityPaint = Integer.parseInt(scanner.nextLine());   //  в литри
        int quantityRazreditel = Integer.parseInt(scanner.nextLine());  // в литри
        int workHours = Integer.parseInt(scanner.nextLine());

        double NylonPrice = (quantityNylon + 2) * 1.50;
        double PaintPrice = (quantityPaint + quantityPaint * 0.1) * 14.50;
        double RazreditelPrice = quantityRazreditel * 5.00;
        double bagPrice = 0.40;


        double sumMaterials = NylonPrice + PaintPrice + RazreditelPrice + bagPrice;
        double WorkersPrice =(sumMaterials * 0.3) * workHours;
        double FinalPrice = sumMaterials + WorkersPrice;

        System.out.println(FinalPrice);


    }
}
