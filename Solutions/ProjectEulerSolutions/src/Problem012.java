/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find first triangle number to have 500 divisors
 * 
 * Poor brute force solution. Needs optimization. Took at least 20 minutes.
 * 
 */
public class Problem012 {

	public static void main(String[] args) {
		int lastNum = 0;
		int currentIter = 1;
		//getting to the first triangle number over 500
		while(lastNum < 500) {
			lastNum += currentIter;
			currentIter++;
		}
		
		
		while(true) {
			lastNum += currentIter;
			
			//checking divisors on current triangle number
			int totalDivisors = 0;
			for(int i = 1; i <= lastNum; i++) {
				if(lastNum % i == 0)
					totalDivisors++;
			}
			
			if(totalDivisors >= 500)
				break;
			
			currentIter++;
		}
		
		System.out.println("The first triangle number to have 500 divisors is: " + lastNum);
		

	}

}
