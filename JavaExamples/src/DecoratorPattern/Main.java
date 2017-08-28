package DecoratorPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cake cake = new Cake();
		System.out.println(cake.getCake());
		
		CreamDecorator creamCake = new CreamDecorator(cake);
		System.out.println(creamCake.getCake());
		
		StrawberryDecorator strawberryCake = new StrawberryDecorator(creamCake);
		System.out.println(strawberryCake.getCake());
		
	}

}
