package FieldDiversity;

import javax.jws.soap.SOAPBinding;

public class HanKooKTire extends Tire{

	public HanKooKTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	//메소드
	/** tire의 roll() 메서드 재정의 구현 **/
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " HanKooKTire 수명 : " + (maxRotation - accmulatedRotation) + "회");
			return true;
		}else {
			System.out.println("*** "+ location +" HanKooKTire 평크 ***");
			return false;
		}
	}
	
}
