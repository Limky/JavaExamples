package TemplateCallbackPattern;

public class Solider {
	void runContext(Strategy strategy) {
		System.out.println("��Ʋ �׶��� ����");
		strategy.runStrategy();
		System.out.println("��Ʋ ����");
	}

}
