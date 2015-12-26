package com.avi.problem.four;

public class LargePalindromeProduct
{

	public static void main(String[] args)
	{
		int n = 9009;
		System.out.println(isPallindrome(String.valueOf(n)));

		generatePallinDrome();
	}

	public static void generatePallinDrome()
	{
		int max = 999;

		int min = 100;

		long foundMax = 0l;
		for (int i = max; i >= min; i--)
		{
			for (int j = max; j >= min; j--)
			{
				long current = i * j;
				if (isPallindrome(String.valueOf(current)) && current > foundMax)
				{
					foundMax = current;
				}
			}
		}

		System.out.println(foundMax);
	}

	public static boolean isPallindrome(String s)
	{
		boolean isPallindrome = true;

		char[] chars = s.toCharArray();
		int n = chars.length - 1;
		for (int i = 0; i <= n; i++)
		{
			if (chars[i] != chars[n - i])
			{
				isPallindrome = false;
				break;
			}
		}
		return isPallindrome;
	}
}
