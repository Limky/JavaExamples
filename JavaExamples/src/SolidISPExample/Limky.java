package SolidISPExample;

public class Limky implements Prayable, Developable, Cookable, Shootable {

	@Override
	public void pray() {
		System.out.println("기도한다.");
	}

	@Override
	public void shoot() {
		System.out.println("사격한다.");
	}

	@Override
	public void cook() {
		System.out.println("요리한다.");
		
	}

	@Override
	public void develop() {
		System.out.println("개발한다.");
		
	}

}
