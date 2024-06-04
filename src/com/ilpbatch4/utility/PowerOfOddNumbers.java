package com.ilpbatch4.utility;
import java.lang.Math;
public class PowerOfOddNumbers {

	public static void main(String[] args) {
		int input = 5;
		findPowerOfOddNumbers(input);

	}

	private static void findPowerOfOddNumbers(int input) {
		double sum = 0;
		double base = 1;
		for(int i = 1; i<=input; i++)
		{
			
			
			if(i%2==0)
			{
				double power = Math.pow(base, i);
//				System.out.print(power+ ",");
				sum = sum - power;
				
			}
			else
			{
				double power = Math.pow(base, i);
//				System.out.print(power + ",");
				sum = sum + power;
			}
			base = base + 2;
		}
		System.out.print(sum);
	}

}