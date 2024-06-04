package com.ilpbatch4.utility;

public class SumOfCubeOfFibanocciSeries {

	public static void main(String[] args) {
		int input = 5;
		findSumOfCubesOfFibanocci(input);
	}

	private static void findSumOfCubesOfFibanocci(int input) {
		
		int num1 = 1;
		int num2 = 2;
		 int sum = 9;
//		System.out.print(1+ " "+ 8 +" ");
		for(int i = 0; i <input - 2;i++)
		{	
			int num3 = num1+ num2;
			num1 = num2;
			num2 = num3;
			int cube = (num3*num3*num3);
			sum = sum + cube;
//			System.out.print((cube) +" ");
			
		}
		System.out.println(sum);
	}

}
