/*wap to demonstrate ternary operator .define a variable marks  .ask its value from user and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"*/

package Assignment_basic;

import java.util.*;

public class Ternary1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		int marks;
		System.out.println("enter the marks");
		marks=s.nextInt();
		String result;
		result=(marks>40) ? "Pass" : "Fail";
		System.out.println("Result is:"+result);
		
	}

}
