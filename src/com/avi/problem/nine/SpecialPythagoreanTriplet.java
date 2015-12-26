package com.avi.problem.nine;

public class SpecialPythagoreanTriplet
{

	public static void main(String[] args)
	{
		int sum = 1000;
		specialPythaorean(sum);
	}

	public static void specialPythaorean(int sum)
	{
		int sumOfTwo = sum / 2 + 1;

		int third = sum - sumOfTwo;

		while (third > 0)
		{
			int c = third;
			for (int i = 1; i <= sumOfTwo; i++)
			{
				int a = i;
				int b = sumOfTwo - a;
				if (isPythagorean(a, b, c))
				{
					System.out.println(a + "," + b + "," + c);
					System.out.println("Product: " + (a * b * c));
				}
			}
			third--;
			sumOfTwo = sum - third;
		}
	}

	public static boolean isPythagorean(int a, int b, int c)
	{
		boolean isPythagorean = false;

		isPythagorean = (c * c == (a * a + b * b));

		return isPythagorean;
	}
}
