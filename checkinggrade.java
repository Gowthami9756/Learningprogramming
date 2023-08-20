package kodnestAssignments;
import java.util.Scanner;

public class checkinggrade {

	public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				System.out.println("enter the grade");
				int grade = scan.nextInt();
				scan.close();
		        checkGrade(grade);
			}

		    public static void checkGrade(int grade) {
			
			    if(grade > 50) {
				     System.out.println("pass");
			    }
			    else
			    {
				     System.out.println("Fail");
			    }
		
	}

}
