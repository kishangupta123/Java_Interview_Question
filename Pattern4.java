package Pattern.Assignment;

public class Pattern4 {
    public static void main(String[] args) {
        int n = 5; 
        int count = 1; 

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 5; j++) { 
                System.out.printf("%3d", count);
                count++; 
            }
            System.out.println(); 
        }
    }
}
