package JavaStringMethods;


public class JavaStringMethods {

	public static void main(String[] args) {
	
		TestStringMethod object = new TestStringMethod();
	}
	
}

class TestStringMethod{
	
	TestStringMethod(){
		
		startWith();
		endWith();
		equals();
		indexOf();
		lastindexOf();
		length();
		replace();
		replaceAll();
		replaceFirst();
		split();
		substring();
		toLowerCase();
		toUpperCase();
		testToString();
		trim();
		valueOf();
		compareTo();
		contains();
		charAt();
		concat();
		format();
		matches();
	
	}
	
	private void startWith() {
		//startWith: ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ� ������ true��ȯ �ƴϸ� false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		String str = "apple";
		boolean startsWith = str.startsWith("a");
		System.out.println("startsWith: " + startsWith);
		
	}
	
	private void endWith() {
		//endWith:���ڿ� �������� ������ ���ڰ� �ִ����� �Ǵ��� ������ true, ������ false�� ��ȯ�Ѵ�.(��ҹ��ڱ���)
		String str = "test";
		boolean endsWith = str.endsWith("t");
		System.out.println("endsWith: " + endsWith);
		
	}
	
	private void equals() {
		//equals:�ΰ��� String�� ������ ���ؼ� ������ true, �ٸ��� false�� ��ȯ�Ѵ�.(��Һ�)
		String str1 = "java";
		String str2 = "java";
		boolean equals = str1.equals(str2);
		System.out.println("equals: " + equals);
	}
	
	private void indexOf() {
		//indexOf:������ ���ڰ� ���ڿ��� ���°�� �ִ����� ��ȯ�Ѵ�.(ù��°�� ����)
		String str = "dafbcddef";
		int indexOf = str.indexOf("de");
		System.out.println("indexOf: " + indexOf);
	}
	
	private void lastindexOf() {
		//lastindexOf:���ڿ��� ������ ���ڰ� ���������°�� �ִ� int�� ��ȯ�Ѵ�.
		String str = "AdnroidApp";
		int lastIndexOf = str.lastIndexOf("A");
		System.out.println("lastIndexOf:" + lastIndexOf);
	}
	
	private void length() {
		//length:���ڿ��� ���̸� ��ȯ�Ѵ�.
		String str = "abcdef";
		int length = str.length();
		System.out.println("length: " + length);
	}
	
	private void replace() {
		//replace:���ڿ��� ������ ����" "�� ������ ���� ������ ����" "�� �ٲ㼭 ����Ѵ�.
		String str = "A*B*C*D";
		String replace = str.replace("*", "-");
		System.out.println("replace: " + replace);
	}
	
	private void replaceAll() {
		//replaceAll:����ǥ������ ������ ���ڷ� �ٲ㼭 ����Ѵ�.
		String str = "AB CD";
		String replaceAll = str.replaceAll(" ", "*");
		System.out.println("replaceAll: " + replaceAll);
	}
	
	private void replaceFirst() {
		//replaceFirst:���ڿ��� ������ ����" "�� ������ ù��°�� ���������� ����" "�� �ٲ㼭 ����Ѵ�.
		String str = "Aman";
		String replaceFirst = str.replaceFirst("A", "super");
		System.out.println("replaceFirst: " + replaceFirst);
	}
	
	private void split() {
		//split:������ ���ڷ� ���ڿ��� ������ �ִ�.(�迭�� ��ȯ)
		String str = "A:B:C:D:abcd";
		String[] split = str.split(":");
		System.out.println("split: " + split[1]);
	}
	
	private void substring() {
		//substring:���ڿ��� ������ ������ ���ϴ� ���ڿ��� ��ȯ�Ѵ�.(���۹����� ���� �����ϰ�, ������ ������ ���� ���������ʴ´�.)
		String str = "ABCDEF";
		String substring = str.substring(2, 5);
		System.out.println("substring: " + substring);
	}
	
	private void toLowerCase() {
		//toLowerCase: ���ڿ��� �빮�ڸ� �ҹ��ڷ� ��ȯ�Ѵ�.
		String str = "abcDEF";
		String toLowerCase = str.toLowerCase();
		System.out.println("toLowerCase: " + toLowerCase);
	}
	
	private void toUpperCase() {
		//toUpperCase:���ڿ��� �ҹ��ڸ� �빮�ڷ� ��ȯ�Ѵ�.
		String str = "abcDEF";
		String toUppercase = str.toUpperCase();
		System.out.println("toUppercase: " + toUppercase);
	}
	
	private void testToString() {
		//toString:���ڿ��� �״�� ��ȯ���ش�.
		String str = "1234";
		String toString = str.toString();
		System.out.println("toString: " + toString);
	}
	
	private void trim() {
		//trim:���ڿ��� ������ �����ش�.
		String s = "     java java java     ";
		String v;
		v = s.trim();
		System.out.println("trim:" + v);
	}
	
	private void valueOf() {
		//valueOf:������ ��ü�� ���� ���� ��ȯ
		int i = 12345;
		long l = 1L;
		char c = '1';
		System.out.println("valueOf: " + String.valueOf (i));
		System.out.println("valueOf: " + String.valueOf (l));
		System.out.println("valueOf: " + String.valueOf (c));
	}
	
	private void compareTo() {
		//compareTo:�ΰ��� String�� �տ������� ���������� ���ϴٰ� Ʋ���κ��� ������ ���ϴ� String�� ĳ���Ͱ��� ��ȯ�Ѵ�.(��ҹ��ڸ� ����)
		String str1 = "AAA";
		String str2 = "AAB";
		int compareTo = str1.compareTo(str2);
		if(compareTo > 0){
		       System.out.println(str1 + " > " +str2);
		} else if (compareTo == 0){
		       System.out.println(str1 + " = " +str2);
		} else{
		       System.out.println(str1 + " < " +str2);
		}
	}
	
	private void contains() {
		//contains:�ΰ��� String�� ���ؼ� �񱳴�� String�� �����ϰ� ������true, �ٸ��� false�� ��ȯ�Ѵ�.
		String str1 = "abcd";
		String str2 = "c";
		boolean contains = str1.contains(str2);
		System.out.println("contains: " + contains);
	}
	
	private void charAt() {
		//charAt:������ index��°�� ���ڸ� ��ȯ�Ѵ�.
		String str = "charAt";
		char charAt = str.charAt(2);
		System.out.println("charAt: " + charAt);
	}
	
	private void concat() {
		//concat:���ڿ� ���ڸ� �������ش�.
		String str1 = "Lim";
		String str2 = "KyeoungHo";
		String concat = str1.concat(str2);
		System.out.println("concat: " + concat);
	}
	
	private void format() {
		//format:���Ĺ��ڿ��� �̿��ؼ� ����ȭ�� ���ڿ��� ��ȯ�Ѵ�.
		int i = 1234456789;
		String str = String.format("%,d", i);
		System.out.println("format: " + str);
	}
	
	private void matches() {
		//matches:������ ���� ǥ���� ��ġ �Ҷ� true�� ��ȯ�Ѵ�.
		int i = 123456;
		String str1 = String.format("%,d", i);
		String str2 = "123.456";
		boolean matches = str1.matches(str2);
		System.out.println("matches: " + matches);
	}
	
	
}