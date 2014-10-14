/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the number under 1,000,000 producing largest Collatz chain
 * 
 * Could possibly cache found results to optimize though this only took approx 3 seconds anyway. Brute force ftw!
 * 
 */

public class Problem014 {

	public static void main(String[] args) {
		int longestChain = 0;
		int numLongChain = 0;
		
		for(int i = 1; i <= 1000000; i++) {
			System.out.println(i);
			double j = (double) i;
			int total = 0;
			while(j != 1) {
				if(j % 2 == 1)
					j = (3 * j) + 1;
				else
					j /= 2;
				
				total++;
			}
			
			if(total > longestChain) {
				longestChain = total;
				numLongChain = i;
			}
		}
		
		System.out.println("The longest chain is: " + longestChain + " --- The num with this chain is: " + numLongChain);

	}

}
