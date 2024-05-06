package java_Interview_program.pattern;

import java.util.Scanner;

/*
Write the program to print the following pattern
        A
      A B A
    A B C B A
  A B C D C B A
A B C D E D C B A
 */
public class Pattern5 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows u want to print :: ");
        int N = Integer.parseInt(scanner.nextLine().trim());
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int d = (N - 1) * 2;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < d - 1; j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                if (i == N - 1 && j == 0)
                    System.out.print(CHARS.charAt(j));
                else
                    System.out.print(" " + CHARS.charAt(j));
            for (int j = i - 1; j >= 0; j--)
                System.out.print(" " + CHARS.charAt(j));
            d -= 2;
            if (i < N - 1)
                System.out.println();
        }
        scanner.close();
    }
}
