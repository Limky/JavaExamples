package AlgorithmExample;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisibleMain {

	public static void main(String[] args) {
		Divisible div = new Divisible();
		int[] array = {5, 9, 7, 10};
		System.out.println( Arrays.toString( div.divisible(array, 5) ));
	}

}
class Divisible {
	public int[] divisible(int[] array, int divisor) {
		//ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%divisor == 0) {
				arrayList.add(array[i]);
				
			}
		}
		int[] ret = new int[arrayList.size()];
		for(int i = 0 ; i < ret.length; i++) {
			ret[i] = arrayList.get(i);
		}
		
		
		
		return ret;
	}
}