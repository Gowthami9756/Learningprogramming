package kodnestAssignments;

import java.util.Scanner;

public class Primenumbersprinter {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter the number");
		    int n = scan.nextInt();
		    scan.close();
		    printprimenumber(n);
		}
		public static void printprimenumber(int n) {
			int i,m=0,flag=0;          
			  m=n/2;      
			  if(n==0||n==1){  
			   System.out.println();      
			  }else{  
			   for(i=2;i<=m;i++){      
			    if(n%i==0){            
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(n); }  
			  }//end of else  
			}    
			  

		}
