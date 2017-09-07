package DefaultMethodInterfaceExample;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//java 8 ���� default method ��������
	default int exec(int i, int j){
		return i + j;
	}
	//java 8 ���� static method ��������
	public static int exec2(int i, int j){
		return i * j;
	}
}
