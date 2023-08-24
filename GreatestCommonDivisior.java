package kodnestAssignments;

import java.util.Scanner;

public class GreatestCommonDivisior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a: ");
		int a = scan.nextInt();
		System.out.println("enter b: ");
	    int b = scan.nextInt();
	    findGCD(a,b);
}
	public static void findGCD(int a, int b) {
		int gcd = 1;
		for(int i=1;i<=a && i<=b ;++i) {
			if(a%i==0 && b%i==0) {
			 gcd = i;			
    	}}
		System.out.println(gcd);
	}

}

