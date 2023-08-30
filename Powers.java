package kodnestAssignments;

import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int num = scan.nextInt();
	    System.out.println("Enter The power to which it should be raised");
	    int n = scan.nextInt();
	    Power2 p2 = new Power2();
	    int res = p2.raiseToPower(num,n);
	    System.out.println(res);
	}

}
