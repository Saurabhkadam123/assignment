/*
 * WAP to ask name ,age and salary of an employee and print on console.
*/

package Assignment_basic;

import java.util.*;


public class Empl_details {
	Scanner sc=new Scanner (System.in);
	String name;
	int age;
	double salary;
	
	
	void record()
	{
		System.out.println("enter the name of employee");
		name=sc.next();
		System.out.println("enter the age of employee");
		age=sc.nextInt();
		System.out.println("enter the salary of an employee");
		salary=sc.nextDouble();
		
	}
	void display()
	{
		System.out.println("name of employee==>"+name);
		System.out.println("age of employee==>"+age);
		System.out.println("salary of employee==>"+salary);
		
	}
	

	public static void main(String[] args) 
	{
		Empl_details e=new Empl_details();
		e.record();
		e.display();
	}

}
