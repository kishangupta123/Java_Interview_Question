package java_Interview_program.series;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start value of the java_Interview_program.series : ");
        int a = scanner.nextInt();
        System.out.println("Enter the common ratio : ");
        int r = scanner.nextInt();
        System.out.println("Enter the value (N) for the java_Interview_program.series : ");
        int N = scanner.nextInt();

        //printing the first value
        System.out.print(a + " ");
        for (int i = 1; i <= N; i++) {
            //current a will denote the previous value
            a = a * r;
            //new value a is calculated for the i-th iteration
            System.out.print(a + " ");
        }

        scanner.close();
    }
}
