package TemplateMethodPattern;

public class ManualOperationCar extends Car{

	@Override
	void play() {
		System.out.println("Ŭ��ġ�� ���¿��� 2�� �ֱ�");
		System.out.println("��� ���� ����");
	}
	
	void runSomething() {
		System.out.println("�����ϰԤФ� �극��ũ~!!");
	}
}
