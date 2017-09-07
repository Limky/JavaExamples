package AlgorithmExample;

public class NextBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryHelloWorld2 test = new TryHelloWorld2();
		int n = 78;
		System.out.println(test.nextBigNumber(n));
	}

}

class TryHelloWorld2 {
	public int countBinaryOne(int n) {
		int oneNumber = 0;
		String binaryStr = Integer.toBinaryString(n);
	    char str = '1';
	    
		for (int i = 0; i < binaryStr.length(); i++) {
			if (binaryStr.charAt(i) == str) {
				oneNumber++;
			}
		}
		return oneNumber;
	}

	public int nextBigNumber(int n)
    {
        int answer = 0;
        int oneNumber = countBinaryOne(n);
     

        
        for(int i = n+1 ; i < 1000000; i++){
        	int iOneNumber = countBinaryOne(i);
        	if(oneNumber == iOneNumber){
        		return i;
        	}
        }

        return answer;
    }

}