/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find sum of all amicable numbers below 10000
 * 
 * Simple brute force approach
 * 
 */


public class Problem021 {

	public static void main(String[] args) {
		int[] sumDivs = new int[10000];
		for(int i = 1; i <= 10000; i++) {
			int sum = 0;
			for(int j = 1; j < i; j++) {
				if(i % j == 0)
					sum += j;
			}
			sumDivs[i - 1] = sum;
		}
		
		long sumAmicable = 0;
		for(int i = 1; i <= 10000; i++) {
			for(int j = 1; j <= 10000; j++) {
				if(i == j)
					continue;
				if(sumDivs[i - 1] == j && sumDivs[j - 1] == i) {
					sumAmicable += i;
					System.out.println(i + " AND " + j);
					break;
				}
			}
		}
		
		System.out.println(sumAmicable);
	}

}
