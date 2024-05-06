package java_Interview_program.series;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your preferred choice for the java_Interview_program.series: ");
        int N = scanner.nextInt();
//        int N = 15;
        int a = 0;
        int b = 1;

        System.out.println("Fibbonacci Series is : " + N);
        System.out.println(a + " " + b);

        int i = 2;
        while (i <= N) {
            i++;
            int temp = a + b;
            a = b;
            b = temp;

            System.out.println(" " + b);
        }
    }
}
