package patternprogramslevel3;

public class patternS {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((i==0&&j<=n/2)||(j==0&&i<=n/2)|| (i==n/2 && i<=n-j-1) || (j==n/2 && j>=n-i) || (i==n && j<=n/2)) 
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}
	}

}
