package com.avi.problem.three;

public class LargestPrimeFactor
{

	public static void main(String[] args)
	{
		long n = 600851475143l;
		long max = 2;
		for (long i = 3; i < Math.sqrt(n) + 1; i = i + 2)
		{
			boolean isPrime = true;
			for (long j = 3; j < Math.sqrt(i) + 1; j = j + 2)
			{
				if (((i & 1) == 0) || (i % j == 0))
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime && n % i == 0)
			{
				System.out.print(i + ",");
				max = i;
			}
		}
		System.out.println();
		System.out.println(max);
	}
}
