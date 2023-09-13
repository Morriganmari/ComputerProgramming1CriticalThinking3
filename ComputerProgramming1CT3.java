package computerProgramming1CT3;

import java.util.Scanner;

/**This program will calculate the weekly average tax 
 * withholding for customers, fulfilling the criteria 
 * for Option 1 of the Module 3 Critical Thinking exercise.
 * 
 * @author Shayna Almond
 *
 *			Code adapted from:
 * 			Figure 3.6.1 Programming in Java  
 * 			Figure 7.2.1 Programming in Java 
 */


public class ComputerProgramming1CT3 {
	
	/**
	 User is prompted to enter their gross weekly salary. 
	 The program will check for the income range and to 
	 determine the  tax rate. If the user's income is less 
	 than $500 the tax rate is 10%, greater than/equal to 
	 $500 and less than $1500 the tax rate is 15%, greater 
	 than/equal to $1500 and less than $2500 the tax rate is 
	 20%, and greater than/equal to $2500 the tax rate is 30%. 
	 The program will calculate the users average weekly tax 
	 withholding, and then display the amount.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Display request for user to input their average weekly income
		System.out.print("Please enter your average weekly income: $");
		
		double income = scanner.nextDouble();		//Assigns variable income to the user entry
		double taxRate = 0;							//Initializes the variable taxRate.
		
		//Check for income range and assign the appropriate tax rate
		if (income < 500) {							//Income less than $500
			taxRate = 0.1;							//Applicable tax rate.
	    }
		else if (income >= 500 && income < 1500) {	//Income greater than/equal to $500 and less than $1500
			taxRate = 0.15;							//Applicable tax rate.
		}
		else if (income >= 1500 && income < 2500) {	//Income greater than/equal to $1500 and less than $2500
			taxRate = 0.2;							//Applicable tax rate.
		}
		else if (income >= 2500) {					//Income greater than/equal to $2500
			taxRate = 0.3;							//Applicable tax rate.
		}
		
		//Calculate the average weekly tax withholding by multiply the entered income by the applicable tax rate.
		double withHolding = income * taxRate;
		
		//Display the calculated weekly withholding for the user.
		System.out.printf("Your average weekly tax withholding is $%.2f.", withHolding);
		
	}
}

