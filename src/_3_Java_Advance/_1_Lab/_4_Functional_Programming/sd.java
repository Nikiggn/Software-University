package _3_Java_Advance._1_Lab._4_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class sd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 3};

        String num = String.join("", Arrays.stream(nums).mapToObj(Integer::toString).toArray(String[]::new));
        int newNum = Integer.parseInt(num) + 1;
        String d = String.valueOf(newNum);

        nums = new  int[d.length()];

        for (int i = 0; i < d.length() ; i++) {
            nums[i] = Character.getNumericValue(d.charAt(i));
        }
    }
}
