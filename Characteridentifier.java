package kodnestAssignments;

import java.util.Scanner;

public class Characteridentifier {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character");
	    char ch = scan.next().charAt(0);
	    identifyCharacter(ch);
	}
	public static void identifyCharacter(char ch) {
    	if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    		System.out.println("Lower-case Vowel");    		
    		
    	}
    	else if(ch == 'A'|| ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    		System.out.println("Upper-case vowel");
    	}
    	else if(ch >= 'A' && ch <= 'Z') {
    		System.out.println("Upper-case Consonant");
    	}
    	else if(ch >= 'a' && ch <= 'z') {
    		System.out.println("Lower-case Consonant");
    	}
    	else if(ch >= '0' && ch <= '9')
    	{
    		System.out.println("Digit");
    	}
    	else
    	{
    		System.out.println("Special Character");
    	}

}
}
