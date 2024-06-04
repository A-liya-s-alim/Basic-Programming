package com.ilpbatch4.utility;

public class FactorialOfNumber {

	public static void main(String[] args) {
		int input = 3;
		float output = sumOfFactorial(input);
		System.out.println("Factorial = " + output);

	}

	private static float sumOfFactorial(int input) {
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + (float) i / factorial(i);
		}
		return sum;

	}

	private static int factorial(int n) {

		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
