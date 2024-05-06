package java_Interview_program.pattern;

import java.util.Scanner;

public class MirrorImage {
    public static void printPattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
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
