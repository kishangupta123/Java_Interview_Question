package java_Interview_program.converter;

import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        int binary = scanner.nextInt();
        int octal = 0;
        int digitCount = 0;

        int tempOctal = 0;
        int octalPow = 0;
        int power = 0;

        while (binary > 0) {
            int r = (int) (binary % 10);
            tempOctal += r * Math.pow(2, power);
            binary = binary / 10;
            power++;

            if (power == 3) {
                //reset all when complete 3 digits
                power = 0;
                tempOctal *= Math.pow(10, octalPow);
                octal += tempOctal;
                octalPow++;
                tempOctal = 0;
            }
        }

        System.out.println("Octal Number is :" + octal);
    }
}