/* using ternary check if number eneterd by user is positive or negative .
In case number is positive store "Positive number" else store negative number to Result variable*/


package Assignment_basic;
import java.util.*;

public class Ternary2 {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int marks;
		System.out.println("enter the number: ");
		marks=sc.nextInt();
		String result;
		result=(marks>0) ? "Positive number" : "Negative number";
		System.out.println("Result is:"+result);
		
	}
}

	