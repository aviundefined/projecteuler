package com.avi.problem.six;

import java.text.DecimalFormat;

public class DifferenceOfSquqres
{

	public static void main(String[] args)
	{
		int n = 100;
		double diff = sigmaNthenSquare(n) - sigmNSquare(n);
		System.out.println(diff);
		DecimalFormat format = new DecimalFormat("#00,000,000.00");
		System.out.println(format.format(diff));
	}

	public static double sigmNSquare(int n)
	{
		double sigmaNSquare = 0l;
		sigmaNSquare = ((n * (n + 1) * (2 * n + 1))) / 6;
		return sigmaNSquare;
	}

	public static double sigmaNthenSquare(int n)
	{
		double sigmaNthenSquare = 0l;

		sigmaNthenSquare = (Math.pow(n, 4) + 2 * Math.pow(n, 3) + Math.pow(n, 2)) / 4;
		return sigmaNthenSquare;
	}
}
