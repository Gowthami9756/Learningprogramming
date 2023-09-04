package patternprogramslevel3;

public class patternV {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if((i==j&&j<=n-6)||((j==n-i-1&&j>=n-5))) 
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}
	}

}
