package com.ilpbatch4.utility;
 
public class SumOfOddSeries{
 
	public static void main(String[] args) {
		int input = 10;
		seriesSum(input);
	}
	private static void seriesSum(int input) {
		int count = 1;
		int total = 0;
		for (int i = 1; i <= input; i++) {
			if (count % 2 == 0) {
				total = total - i;
				i++;
				count++;
			} else {
				total = total + i;
				i++;
				count++;
			}
		}
		System.out.println(total);
	}
}