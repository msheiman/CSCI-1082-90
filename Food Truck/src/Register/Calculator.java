
package Register;
import Truck.*;

public class Calculator {
	
	public double total = 0;
	
	private double burgerTotal = 0.0;
	private double pizzaTotal = 0.0;
	private double tacoTotal = 0.0;
	private double dessertTotal = 0.0;
	
	private double burgerPrice = BurgerMenu.burgerPrice;
	private double pizzaPrice = PizzaMenu.pizzaPrice;
	private double tacoPrice = TacoMenu.tacoPrice;
	private double dessertPrice = DessertMenu.dessertPrice;
	
	private double burgerAmount = BurgerMenu.burgerNum;
	private double pizzaAmount = PizzaMenu.pizzaNum;
	private double tacoAmount = TacoMenu.tacoNum;
	private double dessertAmount = DessertMenu.dessertNum;
	
	
	
	
	public Calculator(){
		costCalculator();		
		
	}	
	
	public void costCalculator() {
		burgerCalculator(burgerAmount, BurgerMenu.burgerPrice);
		pizzaCalculator(pizzaAmount, pizzaPrice);
		tacoCalculator(tacoAmount, tacoPrice);
		dessertCalculator(dessertAmount, dessertPrice);
		
		total = (burgerTotal + pizzaTotal + tacoTotal + dessertTotal);
		System.out.println("The burgers cost $" + burgerTotal + ", the pizzas cost $"
				+ pizzaTotal + ", the tacos cost" + tacoTotal + ", and the desserts"
				+ "cost $" + dessertTotal + ".");
	}
	
	public double burgerCalculator(double amount, double price) {
		burgerTotal = amount * price;
		return burgerTotal;
	}
		
	public double pizzaCalculator(double amount, double price) {
		pizzaTotal = amount * price;
		return pizzaTotal;
	}
	
	public double tacoCalculator(double amount, double price) {
		tacoTotal = amount * price;
		return tacoTotal;
	}
	
	public double dessertCalculator(double amount, double price) {
		dessertTotal = amount * price;
		return dessertTotal;
	}

}
