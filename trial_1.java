package pack1;

import java.util.Scanner;


public class trial_1 {
	
	Scanner sc=new Scanner (System.in);
	
	String name;
	int age;
	float salary;
	void input()
	{
		System.out.println("enter the name...");
		sc.next();
		System.out.println("enter the age...");
		sc.nextInt();
		System.out.println("enter the salary...");
		sc.nextFloat();
		
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println(name +" "+age+" "+salary);
		
	}

	public static void main(String[] args) {
		trial_1 e=new trial_1();
		e.input();
		e.display();		

	}

}
