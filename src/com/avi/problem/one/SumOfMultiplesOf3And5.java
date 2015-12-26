package com.avi.problem.one;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfMultiplesOf3And5
{

	public static void main(String[] args)
	{
		int n = 1000;
		List<Integer> bases = new ArrayList<>();
		bases.add(3);
		bases.add(5);

		Multiples multiples = multiples(bases, n);

		System.out.println(multiples);
	}

	private static class Multiples
	{
		long sum;
		Set<Integer> multiples;

		public Multiples(long sum, Set<Integer> multiples)
		{
			this.sum = sum;
			this.multiples = multiples;
		}

		public long getSum()
		{
			return sum;
		}

		public Set<Integer> getMultiples()
		{
			return multiples;
		}

		@Override
		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			sb.append("{sum:").append(sum).append(":").append("multiples:").append(multiples).append("}");
			return sb.toString();
		}

	}

	public static Multiples multiples(List<Integer> bases, int n)
	{
		Set<Integer> multiples = new HashSet<>();
		long sum = 0l;

		for (int base : bases)
		{
			for (int i = base; i < n; i = i + base)
			{
				if (multiples.add(i))
				{
					sum = sum + i;
				}
			}
		}
		return new Multiples(sum, multiples);
	}
}
