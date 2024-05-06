package java_Interview_program.series;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start value of the java_Interview_program.series : ");
        int a = scanner.nextInt();

        System.out.println("enter the common ratio : ");
        int b = scanner.nextInt();

        System.out.println("Enter the value for the java_Interview_program.series : ");
        int N = scanner.nextInt();

        System.out.println(a + " ");
        for (int i = 1; i <= N; i++) {
            a = a + b;
            System.out.println(a + " ");
        }
        scanner.close();
    }
}
