import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find best path through triangle
 * 
 * Couldn't use same dynamic programming/ brute force solution as Problem018
 * 
 * In this I simply start from bottom row and for each element add to it the max of the 2 lower elements until top of triangle gives best path
 */


public class Problem067 {

	static int[][] pyr = new int[100][];
	
	public static void main(String[] args) {
		File myFile = new File("triangle.txt");
		try(BufferedReader br = new BufferedReader(new FileReader(myFile))) {
			String line;
			int row = 0;
			while((line = br.readLine()) != null) {
				String[] rowArr = line.split(" ");
				pyr[row] = new int[rowArr.length];
				for(int i = 0; i < rowArr.length; i++)
					pyr[row][i] = Integer.parseInt(rowArr[i]);
				row++;
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}

		for(int i = pyr.length - 2; i >= 0; i--) {
			for(int j = 0; j < pyr[i].length; j++) {
				pyr[i][j] += Math.max(pyr[i + 1][j], pyr[i + 1][j + 1]); 
			}
		}
		
		System.out.println(pyr[0][0]);
	}

}
