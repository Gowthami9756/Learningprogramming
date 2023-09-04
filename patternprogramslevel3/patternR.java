package patternprogramslevel3;

public class patternR {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||(i==0 && j<=n/2)|| (j==n/2 && j<=n-i-1)|| (i==n/2 &&  i<=n-j-1)||(i==j && j>=n-i))
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}
	}
}
