package kodnestAssignments;

import java.util.Scanner;

public class Vendingmachinesimulator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the productCode");
	    String productCode = scan.next();
	    getProduct(productCode);

	}
	public static void getProduct(String productCode) {
		switch(productCode) {
		case "P01":System.out.println("Coca Cola");
		         break;
		case "P02":System.out.println("fanta");
		       break;
		case "P03":System.out.println("jal jeera");
		       break;
		case "P04":System.out.println("Mountain Dew");
		       break;
		case "P05":System.out.println("BoatGuava");
	             break;
		default:System.out.println("panaka");
			
		}

	}
}
