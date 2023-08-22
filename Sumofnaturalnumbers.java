package kodnestAssignments;

import java.util.Scanner;

public class Sumofnaturalnumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int n = scan.nextInt();
	    scan.close();
	    calculatesum(n);
	}
	public static void calculatesum(int n) {
		int sum = 0;
		int i;
		for(i=1;i<=n;i++){
            sum = sum+i;
    	}
		System.out.println(sum);
	}
}
