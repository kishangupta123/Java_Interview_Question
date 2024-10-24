package Pattern.Assignment;

public class Pattern9 {
	public static void main(String[] args) {
		int n = 4, firstNum = 1, secondNum = 1, sum = 0;
		System.out.println("   " + firstNum);
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sum = sum + firstNum;
				System.out.printf("%4d" , sum);
				firstNum = secondNum;
				secondNum = sum;
			}
			System.out.println();
		}
	}
}

/*
 1. First line (i =2)
 	→Loop through j = 1 to 2:
 		→ when j = 1
 			sum = sum + firstNum; → sum = 0 + 1 = 1
 			print sum as 1;
 		→ update
 			firstNum = secondNum → firstNum = 1
			secondNum = sum → secondNum = 1
			
	→For j = 2:
		sum = sum + firstNum; → sum = 1 + 1 = 2
 		print sum as 2;
 		→ update
 			firstNum = secondNum → firstNum = 1
			secondNum = sum → secondNum = 2
			
	output = 1 2
	
	
 2. Second Line (i = 3):
	→Loop through j = 1 to 3:
		→ For j = 1:
			sum = sum + firstNum → sum = 2 + 1 = 3
			Print sum: 3
			→ Update:
				firstNum = secondNum → firstNum = 2
				secondNum = sum → secondNum = 3
		→ For j = 2:
			sum = sum + firstNum → sum = 3 + 2 = 5
			Print sum: 5
			→ Update:
				firstNum = secondNum → firstNum = 3
				secondNum = sum → secondNum = 5
		→ For j = 3:
			sum = sum + firstNum → sum = 5 + 3 = 8
			Print sum: 8
			→ Update:
				firstNum = secondNum → firstNum = 5
				secondNum = sum → secondNum = 8
	output: 3 5 8	
 */