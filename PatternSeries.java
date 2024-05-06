package java_Interview_program.series;

import java.util.Scanner;

public class PatternSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the N value for the java_Interview_program.series : ");
        int N = scanner.nextInt();
        System.out.print("\nThe obtained java_Interview_program.series is: ");
        String s = "";
        for (int i = 0; i < N; i++) {
            s += "3";
            System.out.print(s + " ");
        }

        scanner.close();
    }
}
