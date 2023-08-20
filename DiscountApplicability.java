package kodnestAssignments;

import java.util.Scanner;

public class DiscountApplicability {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the purchase amount");
		double purchaseamount = scan.nextDouble();
		discount(purchaseamount);
	}
	public static void discount(double purchaseamount) {
		if(purchaseamount > 100) {
			System.out.println("DISCOUNT APPLICABLE");
		}
	}

}
