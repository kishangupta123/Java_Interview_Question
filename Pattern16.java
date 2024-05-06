package java_Interview_program.pattern;

import java.util.Scanner;

/*
Write the program to print the following pattern
        1
      3 3 3
    5 5 5 5 5
  7 7 7 7 7 7 7
9 9 9 9 9 9 9 9 9
*/
public class Pattern16 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows :: ");
        int N = Integer.parseInt(scanner.nextLine());
        int iSpace = 0;
        int k = 0;
        for (int i = 0; i < N; i++) {
            for (int j = iSpace; j < N - 1; j++)
                System.out.print("  ");
            for (int j = 0; j <= k; j++)
                if (j == 0)
                    System.out.print(k + 1);
                else
                    System.out.print(" " + (k + 1));
            iSpace++;
            k += 2;
            if (i != N - 1)
                System.out.println();
        }
        scanner.close();
    }
}
