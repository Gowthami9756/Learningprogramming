package kodnestAssignments;

import java.util.Scanner;

public class EvenPrinter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    scan.close();
	    printEvennumber(n);
	}
	public static void printEvennumber(int n) {
		for(int i=1;i<=n;i++){
            if(i%2==0) {
            	System.out.println(i);
            }
    	}
		}
}
