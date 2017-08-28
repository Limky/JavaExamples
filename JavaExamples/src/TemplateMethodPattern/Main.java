package TemplateMethodPattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car labo = new ManualOperationCar();
		Car bmw = new AutomaticOperationCar();
		
		labo.playWithOwner();
		
		System.out.println("\n\n");
		
		bmw.playWithOwner();
	}

}
