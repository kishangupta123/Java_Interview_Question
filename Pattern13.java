package java_Interview_program.pattern;

import java.util.Scanner;

/*
Write the program to print the following pattern
        1
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9
*/
public class Pattern13 {
    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows :: ");
        int N = Integer.parseInt(scanner.nextLine());
        int iSpace = 0;
        for (int i = 0; i < N; i++) {
            for (int j = iSpace; j < N - 1; j++)
                System.out.print("  ");
            for (int j = 1; j <= 2 * i + 1; j++)
                if (j == 1)
                    System.out.print(j);
                else
                    System.out.print(" " + j);
            iSpace++;
            if (i != N - 1)
                System.out.println();
        }
        scanner.close();
    }
}
