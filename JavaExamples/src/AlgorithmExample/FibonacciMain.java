package AlgorithmExample;

import java.util.ArrayList;

public class FibonacciMain {

	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 77;
		System.out.println(c.fibonacci(testCase));
	}
}


class Fibonacci {
	public long fibonacci(int num) {
		ArrayList<Long> list = new ArrayList<>();
		long sum = 0;
		if(num > 2) {
			list.add((long) 1);
			list.add((long) 1);
			 
		for(int i = 0 ; i< num -2;i++) {
			sum = list.get(i) + list.get(i+1);
			list.add(sum);
		
		}
		}
		
		return list.get(num-1);
	}
	
}