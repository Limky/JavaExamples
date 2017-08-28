package TemplateCallbackPattern;

public class ClinetWithCallback {

	public static void main(String[] args) {
		Solider rambo = new Solider();
	
		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("���ø� �ݹ����: ��! Ÿ��!! ������!");
				
			}
		});
		
		System.out.println("\n");

		rambo.runContext(new Strategy() {
			
			@Override
			public void runStrategy() {
				System.out.println("���ø� �ݹ����: ����ź ��ô~! ��!!!");
				
			}
		});
		
	}

}
