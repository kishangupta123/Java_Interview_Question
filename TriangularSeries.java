package java_Interview_program.series;

import java.util.Scanner;

public class TriangularSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int N = scanner.nextInt();

        System.out.println("The Triangular Number Series is: ");
        int vari = 0;
        for (int i = 1; i <= N; i++) {
            vari = vari + i;
            System.out.println(vari);
        }
    }
}
