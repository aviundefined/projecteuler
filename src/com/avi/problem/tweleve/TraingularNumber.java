package com.avi.problem.tweleve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TraingularNumber
{

	public static void main(String[] args)
	{
		int n = 500;

		System.out.println(getFirstTraingularNumberOverNDivisors(n));
	}

	public static long getFirstTraingularNumberOverNDivisors(int n)
	{
		long number = 1l;

		if (n == 0)
		{
			return 1l;
		}
		if (n == 1)
		{
			return 3l;
		}

		int count = 3;
		while (true)
		{
			long current = getNthTraingularNumber(count);
			System.out.println(count + "th traingular number: " + current);
			int numberOfFactors = numberOfFactors(current);
			System.out.println(current + " factors num: " + numberOfFactors);
			if (numberOfFactors > n)
			{
				number = current;
				break;
			}
			count++;

		}
		return number;
	}

	public static long getNthTraingularNumber(int n)
	{
		List<Long> numbers = (List<Long>) generateNTraingularNumber(n);
		return numbers.get(n - 1);
	}

	public static int numberOfFactors(long n)
	{
		return getFactors(n).size();
	}

	public static Collection<Long> generateNTraingularNumber(int n)
	{
		n = n - 1;
		List<Long> traingularNumbers = new ArrayList<>();
		traingularNumbers.add(1l);
		if (n == 1)
		{
			return traingularNumbers;

		}

		int count = 1;
		while (count <= n)
		{
			long temp = traingularNumbers.get(count - 1) + (count + 1);
			traingularNumbers.add(temp);
			count++;
		}
		return traingularNumbers;
	}

	public static Set<Long> getFactors(long n)
	{
		Set<Long> factors = new HashSet<>();

		factors.add(1l);
		factors.add(n);

		for (long i = 2; i <= n / 2 + 1; i++)
		{
			if (n % i == 0)
			{
				factors.add(i);
			}
		}
		return factors;
	}
}
