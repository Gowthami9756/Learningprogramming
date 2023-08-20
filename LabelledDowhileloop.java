package kodnestAssignments;

public class LabelledDowhileloop {

	public static void main(String[] args) {
		int i=1;
	    hello:do {
	    	int j=1;
	    	hi:do {
	    		 System.out.print("## ");
	    		 j++;
	    		 break hello;
	    	 }while(j<=5);
	     }while(i<=5);
	    System.out.println();
		}

	}


