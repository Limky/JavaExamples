package JavaDiversityExample;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
		
			switch (problemLocation) {
			case 1:
				System.out.println("�� ���� HanKooKTire�� ��ü");
				car.frontLeftTire = new HanKooKTire("�� ���� ", 15);
				
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�� ������ ", 13);
				
				break;
			case 3:
				System.out.println("�� ���� HanKooKTire�� ��ü");
				car.backLeftTire = new HanKooKTire("�� ���� ", 14);
				
				break;
			case 4:
				System.out.println("�� ������  KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�� ������ ", 17);
				
				break;

			default:
				
				break;
			}
			System.out.println("=================" + i + " ȸ�� =================");
		}
	}

}
