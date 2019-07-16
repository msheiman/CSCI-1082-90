package Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMenu extends Menu{

	public ArrayList<String> pizzaToppings = new ArrayList<String>();
	private Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");
	public static double pizzaPrice = 6.00;
	public static double pizzaNum = 0;
	{	
	this.menuMotif = " pizzas";
	super.orderBuilder();
	super.orderToppings(); {
		System.out.println("Which toppings would you like?"
				+ "  Please type each topping with a space in between");
		System.out.println("CHEESE, BACON, PEPPERONI, MUSHROOMS, ONIONS, HAM, OLIVES, PINEAPPLE");
		keyboard.hasNextLine();
		inputString = keyboard.nextLine();
		inputString = inputString.toUpperCase();
		
		
		if(inputString.contains("CHEESE") == true) 
			pizzaToppings.add("CHEESE");
		if(inputString.contains("BACON") == true) 
			pizzaToppings.add("BACON");
		if(inputString.contains("PEPPERONI") == true) 
			pizzaToppings.add("PEPPERONI");
		if(inputString.contains("MUSHROOMS") == true) 
			pizzaToppings.add("MUSHROOMS");
		if(inputString.contains("ONIONS") == true) 
			pizzaToppings.add("ONIONS");
		if(inputString.contains("HAM") == true) 
			pizzaToppings.add("HAM");
		if(inputString.contains("OLIVES") == true) 
			pizzaToppings.add("OLIVES");
		if(inputString.contains("PINEAPPLE") == true) 
			pizzaToppings.add("PINEAPPLE");

		System.out.print("You have chosen "); 
		if(pizzaToppings.isEmpty()){
			System.out.println("nothing");
		}
		else for(int i=0;i<pizzaToppings.size();i++) {
			System.out.print(pizzaToppings.get(i) + " " );
		}
		System.out.print(" as toppings.");
		pizzaNum = numOf;

	}
	
}}
