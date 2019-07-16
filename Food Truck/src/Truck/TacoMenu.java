package Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class TacoMenu extends Menu{

	public ArrayList<String> tacoToppings = new ArrayList<String>();
	private Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");
	public static double tacoPrice = 6.00;
	public static double tacoNum = 0;
	{	
	this.menuMotif = " tacos";
	super.orderBuilder();
	super.orderToppings(); {
		System.out.println("Which fillings would you like?"
				+ "  Please type each topping with a space in between");
		System.out.println("CHEESE, ONION, GUACAMOLE,"
				+ " BEEF, CHICKEN, RICE, LETTUCE, BEANS");
		keyboard.hasNextLine();
		inputString = keyboard.nextLine();
		inputString = inputString.toUpperCase();
		
		
		if(inputString.contains("CHEESE") == true) 
			tacoToppings.add("CHEESE");
		if(inputString.contains("ONION") == true) 
			tacoToppings.add("ONION");
		if(inputString.contains("GUACAMOLE") == true) 
			tacoToppings.add("GUACAMOLE");
		if(inputString.contains("BEEF") == true) 
			tacoToppings.add("BEEF");
		if(inputString.contains("CHICKEN") == true) 
			tacoToppings.add("CHICKEN");
		if(inputString.contains("RICE") == true) 
			tacoToppings.add("RICE");
		if(inputString.contains("LETTUCE") == true) 
			tacoToppings.add("LETTUCE");
		if(inputString.contains("BEANS") == true) 
			tacoToppings.add("BEANS");

		System.out.print("You have chosen "); 
		if(tacoToppings.isEmpty()){
			System.out.println("nothing");
		}
		else for(int i=0;i<tacoToppings.size();i++) {
			System.out.print(tacoToppings.get(i) + " " );
		}
		System.out.print(" as fillings.");
		tacoNum = numOf;

	}
	
}}
