package kodnestAssignments;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    scan.close();
	    calculatesumofdigits(n);
	}
	public static void calculatesumofdigits(int n) {
		int  sum = 0;
		int m;
		while(n>0){
			m = n%10;
			sum = sum + m;
			n = n/10;
    	}
		System.out.println(sum);
	}
}
