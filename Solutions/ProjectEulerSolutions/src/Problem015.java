/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find number of possible routes in 20 by 20 grid when you can only move right or down
 * 
 */

public class Problem015 {

	public static void main(String[] args) {
		int dim = 20;
		long[][] grid = new long[dim + 1][dim + 1];
		
		for(int i = dim; i >= 0; i--) {
			for(int j = dim; j >= 0; j--) {				
				if(i == dim || j == dim)
					grid[i][j] = 1;
				else
					grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
			}
		}
		
		System.out.println("Total number routes in " + dim + " by " + dim + " grid: " + grid[0][0]);
	}

}
