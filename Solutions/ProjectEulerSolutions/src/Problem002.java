import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the sum of all fibonacci numbers less than 4,000,000
 */
public class Problem002 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		//add first 2 given numbers
		fibonacci.add(1);
		fibonacci.add(2);
		
		int nextNum;
		
		//add numbers to list by summing previous 2 nums
		while((nextNum = fibonacci.get(fibonacci.size() - 2) + fibonacci.get(fibonacci.size() - 1)) <= 4000000) {
			fibonacci.add(nextNum);
		}
		
		int totalSum = 0;
		
		//sum only even numbers from list
		for(int num : fibonacci) {
			if(num % 2 == 0)
				totalSum += num;
		}
		
		System.out.println("The sum of all even fibonacci numbers less than 4,000,000 is: " + totalSum);
	}
}
