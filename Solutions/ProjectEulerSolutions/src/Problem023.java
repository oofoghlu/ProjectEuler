import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find sum of all positive integers which cannot be written as sum of 2 abundant numbers
 * 
 * Brute force kind of approach with some semi-clever shortcuts
 * Maybe not perfect solution. Takes approx 1 minute to execute
 * 
 */

public class Problem023 {

	public static void main(String[] args) {
		ArrayList<Integer> abund = new ArrayList<Integer>();
		//12 = 1st abundant number. Everything after 28123 is abundant
		for(int i = 12; i < 28123; i++) {
			int sum = 0;
			
			for(int j = 1; j < i; j++) {
				if(i % j == 0)
					sum += j;
			}
			
			if(sum > i)
				abund.add(i);
		}
		
		int sum = 0;
		ArrayList<Integer> non = new ArrayList<Integer>();
		
		//loop through each number
		for(int i = 1; i <= 28123; i++) {
			boolean cont = false;
			
			//loop for first abundant number to be summed
			for(int j = 0; j < abund.size(); j++) {
				
				if(cont == true)
					break;
				
				//loop for second abundant number to be summed
				for(int k = j; k < abund.size(); k++) {

					//2 numbers sum to the searched number
					if(abund.get(j) + abund.get(k) == i) {
						cont = true;
						break;
					}
					
					//2 numbers are greater than searched number AND position of 2 numbers the same i.e. no higher option can possibly work
					if(abund.get(j) + abund.get(k) > i && k == j) {
						sum += i;
						non.add(i);
						cont = true;
						break;
					}
					
					//2 numbers are greater than searched number
					if(abund.get(j) + abund.get(k) > i)
						break;
						
				}
			}
			System.out.println(i);
		}
		
		System.out.println(sum);
	}

}
