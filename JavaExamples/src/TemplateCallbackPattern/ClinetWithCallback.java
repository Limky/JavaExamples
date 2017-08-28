package TemplateCallbackPattern;

public class ClinetWithCallback {

	public static void main(String[] args) {
		Solider rambo = new Solider();
	
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("ÅÛÇÃ¸´ Äİ¹é¹öÀü: ÅÁ! Å¸ÅÁ!! ÅÁÅÁÅÁ!");
				
			}
		});
		
		System.out.println("\n");

		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("ÅÛÇÃ¸´ Äİ¹é¹öÀü: ¼ö·ùÅº ÅõÃ´~! Äç!!!");
				
			}
		});
		
	}

}
