package pack1;
import java.util.*;


public class Employee {
	
	Scanner sc=new Scanner (System.in);
	
	String name;
	int age;
	float salary;
	void input()
	{
		
		System.out.println("enter the name...");
		name=sc.next();
		System.out.println("enter the age...");
		age=sc.nextInt();
		System.out.println("enter the salary...");
		salary=sc.nextFloat();
		
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+ salary);
		System.out.println(name +" "+age+" "+salary);
		
	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.input();
		e.display();		

	}

}
