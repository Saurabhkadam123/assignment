/*
 * wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price
 */

package Assignment_basic;
import java.util.*;

public class Product {
	Scanner s=new Scanner (System.in);
	String pname;
	float price;
	
	void input()
	{
		System.out.println("enter the product name:");
		pname=s.next();
		System.out.println("enter the product price:");
		price=s.nextFloat();
		
	}
	void disscount()
	{
		if(price>2000)
			System.out.println("Disscount is 10%");
		else
			System.out.println("Disscount is 7%");
	}
	

	public static void main(String[] args) {
		Product p=new Product();
		p.input();
		p.disscount();
		

	}

}
