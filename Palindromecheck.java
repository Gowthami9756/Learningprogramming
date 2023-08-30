
public class Palindromecheck {

	public static void Checkingpalindrome(int n) {
		int  sum = 0,m;
		int temp = n;
		while(n>0){
			m = n%10;
			sum = (sum*10)+m;
			n = n/10;
    	}
    if(temp ==sum) {
    	System.out.println("True");
    }
    else {
    	System.out.println("False");
    }
	}

}
