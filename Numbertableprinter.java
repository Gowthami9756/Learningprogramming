package kodnestAssignments;

import java.util.Scanner;

public class Numbertableprinter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
	    int num = scan.nextInt();
	    scan.close();
	    printTable(num);
	}
	public static void printTable(int num) {
    	for(int i=1;i<=10;i++) {
    		System.out.println(num+ "*"+ i +"="+(num*i));
    	}
	}
}
