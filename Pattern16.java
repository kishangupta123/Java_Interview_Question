package Pattern.Assignment;

public class Pattern16 {
	public static void main(String[] args) {
		int n=5;
		int x=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%2d",x%2);
				x++;
			}
			System.out.println();
			
		}
	}

}
