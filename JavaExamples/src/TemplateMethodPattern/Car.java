package TemplateMethodPattern;
public abstract class Car {
	//템플릿 메서드
	public void playWithOwner() {
		System.out.println("시동 켜기");
		System.out.println("사이드 브레이크 해제");
		
		play();
		runSomething();
		
	}

	//추상 메서드
	abstract void play();
	
	//일반 메서드
	void runSomething() {
		
		System.out.println("브레이크~!!");
	}
}
