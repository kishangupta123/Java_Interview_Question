package java_Interview_program.series;

import java.util.Scanner;

public class Powerof2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value up to which u want the value");
        int n = scanner.nextInt();
        System.out.println("The Series is : ");
        for (int i = 1; i <= n; i++) {
            int value = (int) Math.pow(2, i);
            System.out.print(value + " ");
        }
    }
}
