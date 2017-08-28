package TemplateCallbackPattern;

public class SoliderWithRefactoring {
	void runContext(String StrategySound) {
		System.out.println("배틀 그라운드 시작");
		execute(StrategySound).runStrategy();
		System.out.println("배틀 종료");
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
