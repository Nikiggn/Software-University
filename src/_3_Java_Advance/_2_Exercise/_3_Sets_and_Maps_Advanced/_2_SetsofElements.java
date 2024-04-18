package _3_Java_Advance._2_Exercise._3_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _2_SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] par = scanner.nextLine().split(" ");
        int n = Integer.parseInt(par[0]);
        int b = Integer.parseInt(par[1]);

        Set<String> nn = new LinkedHashSet<>();
        Set<String> bb = new LinkedHashSet<>();

        for (int i = 0; i < n ; i++) {
            String num = scanner.nextLine();
            nn.add(num);
        }

        for (int i = 0; i < b ; i++) {
            String num = scanner.nextLine();
            bb.add(num);
        }

        nn.retainAll(bb);
        nn.forEach(e -> System.out.print(e + " "));


    }
}
