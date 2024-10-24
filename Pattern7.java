package Pattern.Assignment;

public class Pattern7 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			char alphabet = 'A';
			for(int j = 1; j <= n; j++) {
				System.out.print(alphabet + " ");
				alphabet++;
			}
			System.out.println();
		}
	}
}
