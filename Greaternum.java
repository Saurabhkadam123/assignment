//wap  that ask two numbers from user and print greater number among two 
package Assignment_basic;
import java.util.Scanner;

public class Greaternum {
	Scanner sc=new Scanner(System.in);
	int a,b;
	
	void input() {
		System.out.println("enter the first number");
		a=sc.nextInt();
		System.out.println("enter the second number");
		b=sc.nextInt();
	}
	void greater()
	{
		int great;
		great=(a>b) ? (great=a) : (great=b);
		System.out.println("Greatest number is:"+great);
	}

	public static void main(String[] args) {
		Greaternum g=new Greaternum();
		g.input();
		g.greater();
		
	}

}
