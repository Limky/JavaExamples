package FieldDiversity;

public class Car {
	
	//�ʵ�
	Tire frontLeftTire = new Tire("�� ����", 6);
	Tire frontRightTire = new Tire("�� ������", 2);
	Tire backLeftTire = new Tire("�� ����", 3);
	Tire backRightTire = new Tire("�� ������", 4);
	
	//�⺻ ������
	
	//�޼���
	int run() {
		System.out.println(">>> �ڵ����� �޸��ϴ�. >>>");
		if(!frontLeftTire.roll()) {stop(); return 1;}
		if(!frontRightTire.roll()) {stop(); return 2;}
		if(!backLeftTire.roll()) {stop(); return 3;}
		if(!backRightTire.roll()) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("xxx �ڵ����� ����ϴ�. xxx");
		
	}
}
