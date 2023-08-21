package kodnestAssignments;

import java.util.Scanner;

public class Polygonidentifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter no of sides");
	    int sides = scan.nextInt();
	    scan.close();
	    identifyPolygon(sides);
	}
	public static void identifyPolygon(int sides) {
		switch(sides) {
		case 3:System.out.println("Triangle");
		       break;
		case 4:System.out.println("quadrilateral");
		       break;
		case 5:System.out.println("pentagon");
		       break;
		case 6:System.out.println("hexagon");
		       break;
		default:System.out.println("polygon");
			
		}
	}

}
