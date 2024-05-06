package java_Interview_program.pattern;

import java.util.Scanner;

/*
Write the program to print the following pattern
        A
      A B C
    A B C D E
  A B C D E F G
A B C D E F G H I
 */

public class Pattern10 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows :: ");
        int N = Integer.parseInt(scanner.nextLine());
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int iSpace = 0;
        for (int i = 0; i < N; i++) {
            for (int j = iSpace; j < N - 1; j++)
                System.out.print("  ");
            for (int j = 0; j < (2 * i + 1); j++)
                if (j == 0)
                    System.out.print(s.charAt(j));
                else
                    System.out.print(" " + s.charAt(j));
            iSpace++;
            if (i != N - 1)
                System.out.println();
        }
        scanner.close();
    }
}
