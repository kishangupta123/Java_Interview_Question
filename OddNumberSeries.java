package java_Interview_program.series;

import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N value :");
        int N = scanner.nextInt();

        System.out.println("ODD numbers up to " + N);
        for (int i = 1; i <= N; i += 2)
            System.out.print(i + " ");

        scanner.close();
    }
}
