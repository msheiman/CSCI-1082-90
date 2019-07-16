package Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class DessertMenu extends Menu{

	public ArrayList<String> dessertToppings = new ArrayList<String>();
	private Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");
	public static double dessertPrice = 6.00;
	public static double dessertNum = 0;
	{	
	this.menuMotif = " sundaes";
	super.orderBuilder();
	super.orderToppings(); {
		System.out.println("Which toppings would you like?"
				+ "  Please type each topping with a space in between");
		System.out.println("SPRINKLES, CARAMEL, SPRINKLES,"
				+ " WALNUTS, PECANS, CHOCOLATE");
		keyboard.hasNextLine();
		inputString = keyboard.nextLine();
		inputString = inputString.toUpperCase();
		
		
		if(inputString.contains("SPRINKLES") == true) 
			dessertToppings.add("SPRINKLES");
		if(inputString.contains("CARAMEL") == true) 
			dessertToppings.add("CARAMEL");
		if(inputString.contains("SPRINKLES") == true) 
			dessertToppings.add("SPRINKLES");
		if(inputString.contains("WALNUTS") == true) 
			dessertToppings.add("WALNUTS");
		if(inputString.contains("PECANS") == true) 
			dessertToppings.add("PECANS");
		if(inputString.contains("CHOCOLATE") == true) 
			dessertToppings.add("CHOCOLATE");
		System.out.print("You have chosen "); 
		if(dessertToppings.isEmpty()){
			System.out.println("nothing");
		}
		else for(int i=0;i<dessertToppings.size();i++) {
			System.out.print(dessertToppings.get(i) + " " );
		}
		System.out.print(" as fillings.");
		dessertNum = numOf;

	}
	
}}
