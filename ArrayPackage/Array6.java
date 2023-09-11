package ArrayPackage;

import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double heights[] = new double[10];
        for(int i=0;i<=heights.length-1;i++) {
        	System.out.println("Enter an heights of players "+i);
        	heights[i]=scan.nextDouble();
        }
        System.out.println("Enter the heights of players");
        for(int i=0;i<=heights.length-1;i++) {
        	System.out.print(heights[i]+"|");
	}
	}
}
