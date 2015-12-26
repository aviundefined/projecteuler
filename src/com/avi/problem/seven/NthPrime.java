package com.avi.problem.seven;

import java.util.HashSet;
import java.util.Set;

public class NthPrime
{

	public static void main(String[] args)
	{
		int n = 10001;

		System.out.println(n + "th prime: " + nThPrime(n));
	}

	public static long nThPrime(int n)
	{
		long nThPrime = 2l;
		if (n == 1)
		{
			return 2l;
		}

		if (n == 2)
		{
			return 3l;
		}

		int count = 2;

		Set<Long> primes = new HashSet<>();
		primes.add(2l);
		primes.add(3l);
		long i = 5l;

		while (count < n)
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
					count++;
					nThPrime = i;
				}
			}
			i++;
		}

		return nThPrime;
	}
}
