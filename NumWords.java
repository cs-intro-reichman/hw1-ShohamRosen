// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int numbers = Integer.parseInt(args[0]); //the user input a value for the program
		int num1 =  ((int)numbers %  10); //give the ones
		int num2 = ((int)numbers / 10) % 10; //give the hundreds and the tens and the one after the %
		int num3 = ((int)numbers / 100) ; //give the hundreds
		System.out.println(num3 + " hundreds, " + num2 + " tens," + " and " + num1 + " ones.");
	}
}
