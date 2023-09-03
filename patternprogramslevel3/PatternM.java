package patternprogramslevel3;

public class PatternM {

	public static void main(String[] args) {
		int n=11;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||(j==n && i==4)||i==0) 
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
			// TODO Auto-generated method stub
		}// TODO Auto-generated method stub

	}

}
