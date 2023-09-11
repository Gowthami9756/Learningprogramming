package ArrayPackage;

import java.util.Scanner;

public class Array12 {
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of 1st Dimension");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println("Enter 2D length for 1st Dimension "+i);
		arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
		for(int j=0;j<=arr[i].length-1;j++)
		{
		System.out.println("Enter an element");
		arr[i][j]=scan.nextInt();
		}
		}
		System.out.println("Array Contents Are...");
		for(int i=0;i<=arr.length-1;i++)
		{
		for(int j=0;j<=arr[i].length-1;j++)
		{
		System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
		}
}
