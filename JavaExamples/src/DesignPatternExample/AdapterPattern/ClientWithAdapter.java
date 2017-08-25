package DesignPatternExample.AdapterPattern;

public class ClientWithAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdapterServiceA asa1 = new AdapterServiceA();
		AdapterServiceB asb1 = new AdapterServiceB();
		
		asa1.runService();
		asb1.runService();
	}

}
