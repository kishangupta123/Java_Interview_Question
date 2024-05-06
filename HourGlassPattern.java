package java_Interview_program.pattern;

import java.util.Scanner;

public class HourGlassPattern {
    public static void printPattern(int n) {
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if (j == i || j == n || i == 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows :: ");
        int n = scanner.nextInt();
        printPattern(n);
    }
}
