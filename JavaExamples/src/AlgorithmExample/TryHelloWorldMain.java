package AlgorithmExample;

import java.util.ArrayList;
import java.util.Arrays;

public class TryHelloWorldMain {


    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(80, 56)));
    }

}


class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
       
        //최대공약수
        for(int i = a-1 ; i > 0; i--) {
        	if(a % i == 0) {
        		if(b % i == 0) {
        			answer[0] = i;
        			break;
        		}
        		
        	}
     	
        }
           
        //최소공약수
        int i = 1 ;
        //The greatest common divisor
        int gcd;
        if(a > b) {
        	int temp = a;
        	a = b;
        	b = temp;
        }
        while(true) {	
        	gcd = b * i;
        	if(gcd % a == 0) {
        		answer[1] = gcd;
        		break;
        	}
        	i++;
        }
        
        return answer;
    }
    
}