// Splits a restaurant bill evenly among three diners.
public class Bill3 {
    public static void main(String[] args) {
        // To get you started, here is the first line in the program:
        String name1 = args[0]; //the user will input a name and it will change from int to string 
        String name2 = args[1]; //the user will input a name 
        String name3 = args[2]; //the user will input a name 
        int bill = Integer.parseInt(args[3]); //the user will input the value of the bill 
        double splitBill = Math.ceil((double) bill / 3);   //the program will take the number, divide it to 3 and will use the function ceil to round. it up
        System.out.println("Dear " + name1 + ", " + name2 + " and " + name3 + ": " + " pay " + splitBill + " Shekels each");   //print the names and the. values to
        
    }
}
