package java_Interview_program.pattern;

import java.util.Scanner;

/*
Write the program to print the following pattern
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/

public class Pattern18 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Rows required for pattern :: ");
        int N = Integer.parseInt(scanner.nextLine());
        int iSpace = 0;
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = iSpace; j < N - 1; j++)
                System.out.print("  ");
            for (int j = 0; j <= k; j++)
                if (j == 0)
                    System.out.print("*");
                else
                    System.out.print(" *");
            iSpace++;
            k += 2;
            if (i != N - 1)
                System.out.println();
        }
        scanner.close();
    }
}
