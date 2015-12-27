package com.avi.problem.fourteen;

import java.util.ArrayList;
import java.util.List;

public class CollatzNumber
{
	public static void main(String[] args)
	{
		long n = 1000000l;
		getLongestCollatzStart(n);

	}

	public static long getLongestCollatzStart(long n)
	{
		long number = 1l;
		long max = 1l;
		long retVal = 1l;

		while (number < n)
		{
			long length = getLengthOfCollatzSequence(number);
			if (length > max)
			{
				retVal = number;
				max = length;
			}

			number++;
		}

		System.out.println(retVal + ":" + max);
		return retVal;
	}

	public static List<Integer> getCollatzSequence(int n)
	{
		List<Integer> collatzSeq = new ArrayList<>();
		collatzSeq.add(n);

		while (n > 1)
		{
			if ((n & 1) == 0)
			{
				n = n / 2;
			}
			else
			{
				n = (3 * n) + 1;
			}

			collatzSeq.add(n);
		}

		System.out.println(collatzSeq);
		return collatzSeq;
	}

	public static long getLengthOfCollatzSequence(long n)
	{
		long length = 1l;

		while (n > 1)
		{
			if ((n & 1) == 0)
			{
				n = n / 2;
			}
			else
			{
				n = (3 * n) + 1;
			}

			length++;
		}

		return length;
	}
}
