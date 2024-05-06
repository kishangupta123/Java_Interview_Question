package java_Interview_program.pattern;

import java.util.Scanner;
/*
* 	Write a Java Program to print the following Pattern

	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	1 2 3 4 5 6
 */

public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern :: ");
        int N = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
        scanner.close();
    }
}
