package java_Interview_program.converter;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Octal value: ");
        int octal = scanner.nextInt();
        long binary = 0;
        long base = 1;

        System.out.println("Given Octal Number is : " + octal);
        while (octal > 0) {
            int r = octal % 10;
            binary = binary + base * octalToBinary(r);
            octal = octal / 10;
            base = base * 1000;
        }
        System.out.println("Binary Value is : " + binary);
    }

    public static int octalToBinary(int oneDigit) {
        int binary = 0;
        int power = 0;
        while (oneDigit > 0) {
            int r = oneDigit % 2;
            binary = (int) (binary + r * Math.pow(10, power));
            oneDigit = oneDigit / 2;
            power++;
        }
        return binary;
    }
}
