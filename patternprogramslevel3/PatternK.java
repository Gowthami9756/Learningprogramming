package patternprogramslevel3;

public class PatternK {

	public static void main(String[] args) {
		int n=11, k=-4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(j==0||i+j==6||i>4 && i+j==k) 
			        System.out.print("*");
				else
					System.out.print(" ");
		}
			System.out.println();
			k=k+2;// TODO Auto-generated method stub
		}
	}

}
