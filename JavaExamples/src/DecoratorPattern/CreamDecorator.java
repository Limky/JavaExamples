package DecoratorPattern;

public class CreamDecorator extends Cake{
	private Cake cake;
	
	public CreamDecorator(Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getCake() {
		return "*积农覆* "+cake.getCake() + " *积农覆*";
		
	}
}
