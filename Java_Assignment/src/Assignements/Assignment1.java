package Assignements;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		    // Prompt user for number of minutes
		    System.out.println("Enter the number of minutes:");
		    int minutes = input.nextInt();

		int year = minutes / 525600;
		int remainingMinutes = minutes % 525600;
		int day = remainingMinutes / 1440;

		System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
	}

}
