package ProxyPatternExample;

public class Main {

	public static void main(String[] args) {
		//���� ȣ������ �ʰ� ���Ͻø� ȣ���Ѵ�.
		IService proxy = new Proxy();
		System.out.println(proxy.runSomething());
	}
}
