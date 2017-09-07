package DefaultMethodInterfaceExample;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		int i = cal.exec(5, 4);
		int j = Calculator.exec2(1, 3);
		System.out.println(i+"  "+j);
		
	}

}
