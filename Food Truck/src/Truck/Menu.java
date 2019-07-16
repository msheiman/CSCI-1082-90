package Truck;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Menu {

	public int inputInt = 0;
	public static int numOf = 0;
	public static double itemPrice = 0;
	public String menuMotif = "motif";
	public String inputString = null;
	private Scanner keyboard = new Scanner(System.in);
	public ArrayList<String> toppings = new ArrayList<String>(0);
	private boolean tester = false;
	
	Menu(){

		
	}
	
	public void orderBuilder() {
		orderAmount();
		orderToppings();
		setNumberOf(numOf);
		orderSummary(numOf, toppings);
		receiptBuilder(this.toppings, this.numOf);
	}
	
	public int orderAmount() {
	while(tester == false) {
		try{
			
			System.out.println("How many " + this.menuMotif + " would you like?");
			inputInt = keyboard.nextInt();
			tester = true;
			this.numOf = inputInt;
		}
		catch(InputMismatchException e) {
			System.out.println("You have not entered a number.  Please try again.");
			keyboard.nextLine();
		}

		}
	echoInt(inputInt);
	return this.numOf;
	}
		
	
	//this is meant to be overridden in each subclass
	public ArrayList orderToppings() {
		//left blank on purpose
		return toppings;
	}
	
	public void orderSummary(int amount, ArrayList topping) {
		System.out.println("You have chosen " + amount + " " + this.menuMotif);
	}
		
	
	public void receiptBuilder(ArrayList toppingList1, int amount1) {
		
	}

	public void setNumberOf(int amount) {
		numOf = amount;
	}
	
	public void getNumberOf() {
		System.out.println("\nYou have selected " + numOf + menuMotif + ".");
	}
	
	public void echoString(String test) {
		System.out.println(test);
	}
	
	public void echoInt(int test) {
		System.out.println(test);
	}
}
