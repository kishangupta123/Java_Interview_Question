package Pattern.Assignment;

public class Pattern12 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d" , num);
				num++;
			}
			System.out.println();
		}
	}
}
