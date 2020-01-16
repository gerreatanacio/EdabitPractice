package Easy;

import java.util.Arrays;

//Create a function that, given a number, returns the corresponding Fibonacci number.

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(0));
	}

	public static int fibonacci(int a) {
		int[] fibon = new int [a+1];
		if(a>0) {	
		fibon[0] = 1;
		fibon[1] = 1;
		
		for(int i=2; i<fibon.length; i++) {
			fibon[i] = fibon[i-1] + fibon[i-2];
		}
		System.out.println(Arrays.toString(fibon));
		}
		else if(a==0) {
			fibon[0] = 1;
		}return fibon[a];
	}	
}
