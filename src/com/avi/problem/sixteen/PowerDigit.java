package com.avi.problem.sixteen;

import java.math.BigInteger;

public class PowerDigit
{

	public static void main(String[] args)
	{
		int x = 2;
		int y = 1000;

		BigInteger result = getXPowY(x, y);
		System.out.println(result);
		System.out.println(getDigitSum(result));
	}

	public static BigInteger getDigitSum(BigInteger bigInteger)
	{
		BigInteger result = new BigInteger("0");

		char[] chars = bigInteger.toString().toCharArray();

		for (char c : chars)
		{
			result = result.add(new BigInteger(String.valueOf(c)));
		}
		return result;
	}

	public static BigInteger getXPowY(int x, int y)
	{
		BigInteger result = new BigInteger("1");

		if (y == 0)
		{
			return result;
		}

		for (int i = 0; i < y; i++)
		{
			result = result.multiply(new BigInteger(String.valueOf(x)));
		}

		return result;
	}
}
