package com.avi.problem.fiffteen;

public class LatticePaths
{

	private static class Pair
	{
		int x;
		int y;

		Pair(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args)
	{
		int m = 20;
		System.out.println(numberOfRoutes(m));
	}

	public static long numberOfRoutes(int m)
	{

		m = m + 1;
		long[][] routes = new long[m][m];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < m; j++)
			{
				if (i == 0 && j == 0)
				{
					routes[i][j] = 0l;

				}
				else if (i == 0)
				{
					routes[i][j] = 1;
				}

				else if (j == 0)
				{
					routes[i][j] = 1;
				}
				else
				{
					routes[i][j] = 0l;
				}
			}
		}

		for (int i = 1; i < m; i++)
		{
			for (int j = 1; j < m; j++)
			{
				long right = 0l;
				long down = 0l;

				if (i == 0 && j == 0)
				{
					continue;
				}

				if ((j - 1) >= 0)
				{
					right = routes[i][j - 1];
				}

				if ((i - 1) >= 0)
				{
					down = routes[i - 1][j];
				}

				routes[i][j] = down + right;

			}
		}

		printMatrix(routes);
		return routes[m - 1][m - 1];
	}

	public static void printMatrix(long[][] a)
	{
		int m = a.length;
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < m; j++)
			{
				System.out.print(a[i][j] + ",");
			}
			System.out.println();
		}
	}
}
