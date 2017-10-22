package edu.wit.cs.comp1000;
import java.util.Scanner;//init scanner
/**
 * PA5b
 * @author Miles Macchiaroli
 *
 */
public class PA5b {
	/**
	 * This program calculates a stream of non-negative numbers
	 * @param args
	 */
	public static void main(String[] args) {//BEGIN MAIN
		Scanner input = new Scanner(System.in);//call Scanner
//VAR
	String run;
	char cont;
	double avg;
		do {
			System.out.printf("Enter a stream of non-negative numbers (negative when finished): ");
			avg = calculate(input);//send input of scanner to Method
			System.out.printf("The average is: %.2f%n",avg);//Print Average
	//RERUN CALCULATIONS
	System.out.printf("Do you want to compute another average (y/n)? ");
	run = input.next();//Take input
	cont = run.charAt(0);//Check 1st Character of string
}while ((cont == 'y') || (cont == 'Y'));//Rerun Script if user states 'y'
	
	
	}

	
public static double calculate(Scanner a) {
	double ans = 0.0;
	double current;
	int count = 0;
	int loop = 1;
	do {current = a.nextDouble();//select nextInt
		if (current < 0) {loop = 0;}//Set Loop to 0
		else {ans = ans + current;//add numeric to ans
		count++;}}while (loop != 0);
	ans = ans/count;//complete division
	if (Double.isNaN(ans)) {ans = 0;}else {}//Ensures answer is a valid number (if there was no numbers input)
	return ans;
}
	
}
