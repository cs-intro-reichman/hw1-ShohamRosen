// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int theLim = Integer.parseInt(args[0]); //the user will input a number
		int first = ((int) (Math.random() * (theLim - 0 + 1)) + 0); //random num between 0 - max
		int second = ((int) (Math.random() * (theLim - 0 + 1)) + 0); 
		int third = ((int) (Math.random() * (theLim - 0 + 1)) + 0);
		System.out.println(first + " " + second + " " + third); //print the 3 randoms number 
		int oneTwo = Math.min(first, second); //the smaller num between 1 and 2 
		int minNum = Math.min(oneTwo, third); //the smaller number
		int twoTree = Math.max(first, second); //max between the first and the second 
		int maxNum = Math.max(twoTree, third); //the biggest number
		int sum = first + second + third;
		int sumMM = maxNum + minNum;
		int middle = sum - sumMM;
		System.out.println(minNum + " " + middle + " " + maxNum);

	}
}
