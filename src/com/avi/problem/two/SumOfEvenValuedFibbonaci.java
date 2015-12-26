package com.avi.problem.two;

public class SumOfEvenValuedFibbonaci
{

	public static void main(String[] args)
	{
		// f(n) = f(n-1) + f(n-2)

		int a = 1;
		int b = 2;
		int c = -1;
		int evenSum = b;

		int max = 4000000;
		while (c < max)
		{
			c = a + b;
			int temp = b;
			b = c;
			a = temp;
			if ((c & 1) == 0)
			{
				evenSum += c;
			}

			System.out.print(c + ",");
		}

		System.out.println();
		System.out.println(evenSum);
	}
}
