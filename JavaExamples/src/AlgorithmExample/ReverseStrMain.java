package AlgorithmExample;

import java.util.Arrays;

public class ReverseStrMain {

	public static void main(String[] args) {
		ReverseStr rs = new ReverseStr();
		System.out.println( rs.reverseStr("Zbcdefg") );
	}

}
 class ReverseStr {
	public String reverseStr(String str){
		
		char[] sol = str.toCharArray();
		Arrays.sort(sol);

		return new StringBuilder(new String(sol)).reverse().toString();

	}
	
 }