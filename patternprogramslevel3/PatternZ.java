package patternprogramslevel3;

public class PatternZ {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0||i+j==n+1/2||i==n) 
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
	}// TODO Auto-generated method stub

	}

}
