package edu.wit.cs.comp1000;
import java.util.Scanner;//Link Scanner
/**
 * PA5a
 * @author Miles Macchiaroli
 */
public class PA5a {//Begin PA5a
/**
 * This program creates an ascii-art style banner 
 * based on user string input
 */
	public static void main(String[] args) {//BEGIN MAIN
		Scanner input = new Scanner(System.in);//call scanner
		//INIT VARS\\
		String user = "";//input for user string
		int length;//length of input string
		int step = 0;//string position counter
		char current;//current selected character
		//INPUT\\
		
		System.out.printf("Input message: ");
		user = input.nextLine();//set input to string 'user;
		length = user.length();//check length of string
		if (length != 0) {
		do {
			current = user.charAt(step);//select current character
			if ((current == 'd') || (current == 'D')) {d();}//D
			else if ((current == 'e') || (current == 'E')) {e();}//E
			else if ((current == 'h') || (current == 'H')) {h();}//H
			else if ((current == 'l') || (current == 'L')) {l();}//L
			else if ((current == 'o') || (current == 'O')) {o();}//O
			else if ((current == 'r') || (current == 'R')) {r();}//R
			else if ((current == 'w') || (current == 'W')) {w();}//W
			else if (current == ' '){space();}//SPACE
			else {}//invalid character, do nothing
			step++;
		}while (step < length);
		}
		else {}
	}
	
	//LETTERS\\
public static void space()	{//SPACE
	System.out.printf("%n%n%n");
		}
public static void d() {//D
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf(" *   * %n");
	System.out.printf("  ***  %n");
	System.out.printf("%n");
}
public static void e() {//E
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("*  *  *%n");
	System.out.printf("%n");
}
public static void h() {//H
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("   *   %n");
	System.out.printf("   *   %n");
	System.out.printf("   *   %n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}
public static void l() {//L
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("*      %n");
	System.out.printf("%n");
}
public static void o() {//O
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf("*     *%n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}
public static void r() {//R
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("   *  *%n");
	System.out.printf("  **  *%n");
	System.out.printf(" * ****%n");
	System.out.printf("*      %n");
	System.out.printf("%n");
}
public static void w() {//W
	System.out.printf("%n");
	System.out.printf("*******%n");
	System.out.printf("*      %n");
	System.out.printf("****   %n");
	System.out.printf("*      %n");
	System.out.printf("*******%n");
	System.out.printf("%n");
}

}
