package kodnestAssignments;

import java.util.Scanner;

public class Factorialofnumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    scan.close();
	    calculatefactorial(n);

	}
	public static void calculatefactorial(int n) {
		int factorial =1;
		for(int i=1;i<=n;i++){
            factorial = factorial*i;
    	}
		System.out.println(factorial);
	}
}
