package _2_Java_Fundamentals._1_Lab._5_Objects_and_Classes;

import java.util.*;
import java.util.stream.Collectors;

public class _1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> br = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        Random rand = new Random();

        int brLen = br.size();
        for (int i = 0; i < brLen; i++) {

            int index = rand.nextInt(br.size());
            result.add(br.get(index));
            br.remove(index);
        }
        for (String el : result) {
            System.out.println(el);
        }
    }

}
