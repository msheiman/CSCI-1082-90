package Register;

import java.util.Scanner;

import Truck.*;

public class Starters {
	
	private Scanner keyboard = new Scanner(System.in);
	public String inputString = null;
	public BurgerMenu BurgerOrder = new BurgerMenu();
	public PizzaMenu PizzaOrder = new PizzaMenu();
	public TacoMenu TacoOrder = new TacoMenu();
	public DessertMenu DessertOrder = new DessertMenu();


	public Starters(){
		startingMenu();
	}
		
		public void startingMenu() {
	
		System.out.println("Welcome to Food 'n' Things");
		System.out.println("Would you like to order some food?");
		System.out.println("We offer Burgers, Pizza, Tacos, and Desserts");
		System.out.println("Press Yes to continue or No to quit	");
			
		inputString = keyboard.nextLine();
		echoString(inputString);
		inputString.toUpperCase();
		
		switch(inputString) {
		case("YES"): break;
		case("NO"):System.exit(0);
		}
		
		}
		
	
	
	


		
		public void echoString(String test) {
			System.out.println(test);
		}
		
		public void echoDouble(Double test) {
			System.out.println(test);
		}
	}
	
	