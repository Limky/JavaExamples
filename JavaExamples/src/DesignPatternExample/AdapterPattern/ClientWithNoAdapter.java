package DesignPatternExample.AdapterPattern;

public class ClientWithNoAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceA sa1 = new ServiceA();
		ServiceB sb2 = new ServiceB();
		
		sa1.runServiceA();
		sb2.runServiceB();
	}

}
