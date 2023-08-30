import java.util.Scanner;

public class Palindrrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    Palindromecheck p1 = new Palindromecheck();
	    p1.Checkingpalindrome(n);
	}

}
