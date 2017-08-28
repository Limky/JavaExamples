package TemplateCallbackPattern;

public class SoliderWithRefactoring {
	void runContext(String StrategySound) {
		System.out.println("��Ʋ �׶��� ����");
		execute(StrategySound).runStrategy();
		System.out.println("��Ʋ ����");
	}

	private Strategy execute(final String StrategySound) {
		return new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println(StrategySound);
				
			}
		};
		
	}
}
