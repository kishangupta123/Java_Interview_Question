package java_Interview_program.series;

import java.util.Scanner;

public class EvenNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the N value: ");
        int N = scanner.nextInt();

        System.out.println("Even number up to: " + N);
        for (int i = 2; i <= N; i += 2) {
            System.out.println(i + " ");
            scanner.close();
        }
    }
}
