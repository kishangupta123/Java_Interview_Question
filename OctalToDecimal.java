package java_Interview_program.converter;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Octal value: ");
        int octal = scanner.nextInt();
        System.out.println("The Octal Number is : " + octal);
        int pow = 0;
        int decimal = 0;

        while (octal > 0) {
            int unitDigit = octal % 10;
            decimal = (int) (decimal + (unitDigit * Math.pow(8, pow)));
            pow++;
            octal = octal / 10;
        }
        System.out.println("The Decimal Value is : " + decimal);
    }
}
