package Assignements;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    // Prompt user for number of minutes
		    System.out.println("Enter the number:");
		    int n = input.nextInt();
		// TODO Auto-generated method stub
		factorial(n);
		System.out.println("Factorial of number:"+	factorial(n));
	}
	//Calculates the factorial of integer n
	public static int factorial(int n) {
	    if (n == 0)
	        return 1;
	    else {
	        return (n*factorial(n-1));
	       
	       
	        
	    }
	}
	}
	


