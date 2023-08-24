package kodnestAssignments;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    printfibonacciseries(n);
}
	public static void printfibonacciseries(int n) {
		int a = 0;
		int b=1;
		System.out.println(a+"\n"+b);
		for(int i=3;i<=n;i++) {
			int c = a+b;
			a=b;
			b=c;
			System.out.println(c);
    	}
}
}