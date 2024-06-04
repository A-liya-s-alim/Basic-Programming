package com.ilpbatch4.utility;

public class Descending {

	public static void main(String[] args) {
		
		 descendingOrder(4,5,6);
		 
	}

	private static void descendingOrder(int input1, int input2, int input3) {
		if(input1> input2 && input1>input3)
		{
			System.out.print(input1+",");
			if(input2>input3)
			{
				System.out.print(input2+",");
				System.out.print(input3+",");
			}
			else
			{
				System.out.print(input3+",");
				System.out.print(input2+",");
			}
		}
		else if(input2> input1 && input2>input3)
		{
			System.out.print(input2+",");
			if(input1>input3)
			{
				System.out.print(input1+",");
				System.out.print(input3+",");
			}
			else
			{
				System.out.print(input3+",");
				System.out.print(input1+",");
			}
		}
			else
			{
				System.out.print(input3+",");
				if(input1>input2)
				{
					System.out.print(input1+",");
					System.out.print(input2+",");
				}
				else
				{
					System.out.print(input2+",");
					System.out.print(input1+",");
				}
				
			}
		}
		
	}


