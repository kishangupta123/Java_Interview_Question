package java_Interview_program.series;

public class AlternateTenSeries {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;

        System.out.println("The Series is: ");
        for (int i = 0; i < 10; i++, a--, b++)
            System.out.println(a + " " + b + " ");

        System.out.println("\nAlternate Approach");
        a = 10;
        for (int i = 0; i < 10; i++)
            System.out.println((a - i) + " " + (i + 1) + " ");
    }
}
