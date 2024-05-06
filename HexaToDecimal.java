package java_Interview_program.converter;

public class HexaToDecimal {
    public static void main(String[] args) {
//        String hex = "35432";
//		String hex = "153";
        String hex = "A0";
//		String hex = "FAD";

        int decimal = 0;
        int pow = 0;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char unitChar = hex.charAt(i);
            int unitDigitValue = numericValue(unitChar);
            decimal = (int) (decimal + unitDigitValue * Math.pow(16, pow));
            pow++;
        }

        System.out.println("Hexadecimal Value is :" + hex);
        System.out.println("Decimal Value :" + decimal);
    }

    private static int numericValue(char c) {
        //hexa digit may contain alphabet also
        //so we need to it to the corresponding numeric value
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            case 'a':
            case 'A':
                return 10;
            case 'b':
            case 'B':
                return 11;
            case 'c':
            case 'C':
                return 12;
            case 'd':
            case 'D':
                return 13;
            case 'e':
            case 'E':
                return 14;
            case 'f':
            case 'F':
                return 15;
            default:
                return 0;
        }
    }
}
