package DecoratorPattern;

public class StrawberryDecorator extends Cake{
	private Cake cake;
	
	public StrawberryDecorator(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getCake() {
		return "@����@ "+cake.getCake() + " @����@";
		
	}
}
