package java_Interview_program.pattern;

import java.util.Scanner;

/*
To print the pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows of Floyd's Triangle to print :: ");
        int rows = Integer.parseInt(scanner.nextLine().trim());

        //logic to print the Floyd's triangle
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (i + 1); j++, value++)
                System.out.print(value + " ");
            System.out.println();
        }

        scanner.close();
    }
}
