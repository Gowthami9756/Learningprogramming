package kodnestAssignments;

import java.util.Scanner;

public class Nestedelseif {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      System.out.println("Enter a score in exam");
	      int score = scan.nextInt();
	      Conditioncheck(score);
	      scan.close();
		}
		public static void Conditioncheck(int x) {
			if(x >= 40) {
				System.out.println("Student got pass marks");
				if(x >= 70) {
					System.out.println("Student got distiction score");
				}
				else
				{
					System.out.println("Student got First class score");
			}
			}
			else {
					System.out.println("Student got fail marks");
				}
		}
	}


