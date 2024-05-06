package java_Interview_program.pattern;

import java.util.Scanner;

public class PascalTriangle {
    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {

                System.out.print(" ");
            }

            int x = 1;
            for (int k = 1; k <= i; k++) {

                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows for the triangle :: ");
        int n = scanner.nextInt();
        printPascal(n);
    }
}
