package patternprogramslevel3;

public class PatternN {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0|| i==j && (i<n/2+1)||j==i && (i>=n/2+1)||j==n)
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();// TODO Auto-generated method stub

	}
	}
}
