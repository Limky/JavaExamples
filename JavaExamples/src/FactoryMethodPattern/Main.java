package FactoryMethodPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaFactory pizzaFactory = new PizzaFactory();
		Pizza pizza1 = pizzaFactory.createPizza("Tomato");
		Pizza pizza2 = pizzaFactory.createPizza("Pepperoni");
		
		System.out.println(pizza1.getNmae()+"\n");
		System.out.println(pizza2.getNmae()+"\n");
	}

}
