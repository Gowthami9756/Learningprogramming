package ArrayPackage;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				int arr[] = new int[3];
		        for(int i=0;i<=arr.length-1;i++) {
		        	System.out.println("Enter an element");
		        	arr[i]=scan.nextInt();
		        }
		        System.out.println("Array Contents are:");
		        for(int i=0;i<=arr.length-1;i++) {
		        	System.out.println(arr[i]+" ");
		        }
			}



}
