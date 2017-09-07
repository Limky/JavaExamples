package DefaultMethodInterfaceExample;

public interface Calculator {
	public int plus(int i, int j);
	public int multiple(int i, int j);
	
	//java 8 부터 default method 구현가능
	default int exec(int i, int j){
		return i + j;
	}
	//java 8 부터 static method 구현가능
	public static int exec2(int i, int j){
		return i * j;
	}
}
