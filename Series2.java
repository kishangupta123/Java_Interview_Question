package java_Interview_program.series;

import java.util.Scanner;

/*
 * 	Write Java program to generate the following Series
 *
 * 	1 2 4 7 11 16 22 29
 */
public class Series2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for the java_Interview_program.series: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Cannot generate the Series! ");
            System.exit(1);
        }

        for (int i = 1; i <= N; i++) {
            int result = ((i * (i - 1)) / 2) + 1;
            System.out.println(result + " ");
        }
        scanner.close();
    }
}
