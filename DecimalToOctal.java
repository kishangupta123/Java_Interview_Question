package java_Interview_program.converter;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the decimal value : ");
        int decimal = scanner.nextInt();
        int octal = 0;
        int power = 0;

        while (decimal > 0) {
            int r = decimal % 8;
            octal += r * Math.pow(10, power);
            decimal = decimal / 8;
            power++;
        }
        System.out.println("Octal Value is : " + octal);

    }
}