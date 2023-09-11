package ArrayPackage;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String emp[] = new String[8];
        for(int i=0;i<=emp.length-1;i++) {
        	System.out.println("Enter an name of employee "+i);
        	emp[i]=scan.next();
        }
        System.out.println("Names of employess are:");
        for(int i=0;i<=emp.length-1;i++) {
        	System.out.print(emp[i]+"|");
	}
	}
}
