package FieldDiversity;

public class Tire {

	//�ʵ�
	public int maxRotation; 		//�ִ� ȸ���� (Ÿ�̾� ����)
	public int accmulatedRotation; 	//���� ȸ����
	public String location;			//Ÿ�̾��� ��ġ
	
	//������
	public Tire(String location, int maxRotation) {
		//�ʵ� �ʱ�ȭ
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼���
	public boolean roll() {
		
		++accmulatedRotation;//���� ȸ������ ������Ų��.
		
		//����ȸ������ Ÿ�̾��� �ִ�ȸ�������� �������� ��� Ÿ�̾�� ��ũ����.
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� : " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
			
		}else {
			System.out.println("*** " + location + "Tire ��ũ ***");
			return false;
		}
	}
	
}
