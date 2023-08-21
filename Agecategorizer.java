package kodnestAssignments;

import java.util.Scanner;

public class Agecategorizer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the age");
	    int age = scan.nextInt();
	    scan.close();
	    Categorizeage(age);
	}
	public static void Categorizeage(int age) {
    	if(age >= 0 && age <= 12) {
    		System.out.println("child");
    		
    	}
    	else if(age >= 13 && age <= 19) {
    		System.out.println("Teen");
    	}
    	else if(age >=20 && age <=59) {
    		System.out.println("Adult");
    	}
    	else{
    		System.out.println(" Senior");
    	}
    	

}
}
