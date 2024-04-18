package _2_Java_Fundamentals._1_Lab._5_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class songs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Songs_4_> songs = new ArrayList<>();

        int n  = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] songArgs = scanner.nextLine().split("_");

            String songType =  songArgs[0];
            String name  = songArgs[1];
            String time = songArgs[2];

            Songs_4_ song = new Songs_4_(songType, name, time);

            songs.add(song);

        }
        String filter= scanner.nextLine();

        boolean shouldFilter = !filter.equals("all");

        for (Songs_4_ song :songs) {
            if (!shouldFilter){
                System.out.println(song.getName());
            }else if (song.getTypeList().equals(filter)){
                System.out.println(song.getName());
            }
        }
        
    }
}
