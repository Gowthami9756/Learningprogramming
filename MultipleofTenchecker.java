package kodnestAssignments;

import java.util.Scanner;

public class MultipleofTenchecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    scan.close();
	    CheckMultipleofTen(n);
	}
    public static void CheckMultipleofTen(int n) {
    	if(n%10 == 0) {
    		System.out.println("The number is a multiple of 10");
    	}
    	else {
    		System.out.println(" The number is Not a Multiple of ten");
    	}
    	
    }
}
