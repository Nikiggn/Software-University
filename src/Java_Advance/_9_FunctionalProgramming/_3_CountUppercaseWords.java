package Java_Advance._9_FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class _3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpperCase = s ->Character.isUpperCase(s.charAt(0));
        Consumer<String> printToconsule = x -> System.out.println(x);

        List<String> tw = Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isUpperCase)
                .collect(Collectors.toList());

        printToconsule.accept(String.valueOf(tw.size()));
        tw.forEach(printToconsule);
    }
}
