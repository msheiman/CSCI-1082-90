package Truck;
import java.util.ArrayList;
import java.util.Scanner;

public class BurgerMenu extends Menu{

	public ArrayList<String> burgerToppings = new ArrayList<String>();
	private Scanner keyboard = new Scanner(System.in).useDelimiter("\\n");
	public static double burgerPrice = 2.00;
	public static double burgerNum = 0;
{
	


	this.menuMotif = " burgers";
	super.orderBuilder();
	super.orderToppings(); {
		System.out.println("Which toppings would you like?"
				+ "  Please type each topping with a space in between");
		System.out.println("CHEESE, BACON, LETTUCE, TOMATO, ONION, KETCHUP, MUSTARD, PICKLES");
		keyboard.hasNextLine();
		inputString = keyboard.nextLine();
		inputString = inputString.toUpperCase();
		
		if(inputString.contains("CHEESE") == true) 
			burgerToppings.add("CHEESE");
		if(inputString.contains("BACON") == true) 
			burgerToppings.add("BACON");
		if(inputString.contains("LETTUCE") == true) 
			burgerToppings.add("LETTUCE");
		if(inputString.contains("TOMATO") == true) 
			burgerToppings.add("TOMATO");
		if(inputString.contains("ONION") == true) 
			burgerToppings.add("ONION");
		if(inputString.contains("KETCHUP") == true) 
			burgerToppings.add("KETCHUP");
		if(inputString.contains("MUSTARD") == true) 
			burgerToppings.add("MUSTARD");
		if(inputString.contains("PICKLES") == true) 
			burgerToppings.add("PICKLES");
		
		System.out.print("You have chosen "); 
		if(burgerToppings.isEmpty()){
			System.out.println("nothing");
		}
		else for(int i=0;i<burgerToppings.size();i++) {
			System.out.print(burgerToppings.get(i) + " " );
		}
		System.out.print(" as toppings."); 
		burgerNum = numOf;
	}
	
	
	getNumberOf();
	
}	
}
