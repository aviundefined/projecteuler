package com.avi.problem.ten;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public class PrimeBelowN
{

	public static void main(String[] args)
	{
		long n = 2000000l;

		double d = primeBelow(n);

		DecimalFormat format = new DecimalFormat("#00,000,000.00");
		System.out.println(format.format(d));
	}

	public static double primeBelow(long n)
	{
		if (n == 2)
		{
			return 2l;
		}

		if (n == 3)
		{
			return 5l;
		}

		int count = 2;

		Set<Long> primes = new HashSet<>();
		primes.add(2l);
		primes.add(3l);
		long i = 5l;
		double sum = 5;
		while (i < n)
		{
			if (i % 6 == 5 || i % 6 == 1)
			{
				boolean isPrime = true;
				for (long prime : primes)
				{
					if (i % prime == 0)
					{
						isPrime = false;
						break;
					}
				}

				if (isPrime)
				{
					primes.add(i);
					System.out.println(i);
					count++;
					sum += i;
				}
			}
			i++;
		}

		return sum;
	}
}
