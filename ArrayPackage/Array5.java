package ArrayPackage;

import java.util.Scanner;

public class Array5 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String bank_customers[][] = new String[5][6];
	        for(int i=0;i<=bank_customers.length-1;i++) {
	        	for(int j=0;j<=bank_customers[i].length-1;j++) {
	        	System.out.println("Bank "+i+" Customers "+j+" Name:");
	        	bank_customers[i][j]=scan.next();
	        }
	        }
        System.out.println("Array contents are......");
        System.out.println("...............................................");
        for(int i=0;i<=bank_customers.length-1;i++) {
        	for(int j=0;j<=bank_customers[i].length-1;j++) {
        	System.out.print(bank_customers[i][j]+"");
        	}
        	System.out.println();
        }
	}

}
