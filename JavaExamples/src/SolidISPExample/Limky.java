package SolidISPExample;

public class Limky implements Prayable, Developable, Cookable, Shootable {

	@Override
	public void pray() {
		System.out.println("�⵵�Ѵ�.");
	}

	@Override
	public void shoot() {
		System.out.println("����Ѵ�.");
	}

	@Override
	public void cook() {
		System.out.println("�丮�Ѵ�.");
		
	}

	@Override
	public void develop() {
		System.out.println("�����Ѵ�.");
		
	}

}
