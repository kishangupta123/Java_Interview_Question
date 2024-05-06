package java_Interview_program.series;

import java.util.Scanner;

// Print the following Series
// 2 9 28 65 126 217 344

public class Series1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The java_Interview_program.series is: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int value = (i * i * i) + 1;
            System.out.println(value);
        }
    }
}
