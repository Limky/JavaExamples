package FieldDiversity;

import javax.jws.soap.SOAPBinding;

public class HanKooKTire extends Tire{

	public HanKooKTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	//�޼ҵ�
	/** tire�� roll() �޼��� ������ ���� **/
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " HanKooKTire ���� : " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		}else {
			System.out.println("*** "+ location +" HanKooKTire ��ũ ***");
			return false;
		}
	}
	
}
