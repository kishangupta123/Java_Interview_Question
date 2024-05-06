package java_Interview_program.series;

import java.util.Scanner;

public class QuadraticSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the term : ");
        int N = scanner.nextInt();

        System.out.println("The java_Interview_program.series is: ");
        int prevTerm = 1;
        System.out.println(prevTerm);

        for (int i = 2; i <= N; i++) {
            prevTerm = prevTerm + i - 1;
            System.out.println(prevTerm);
        }
    }
}
