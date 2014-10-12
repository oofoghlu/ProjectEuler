import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the sum of primes below 2,000,000
 * 
 */
public class Problem010 {

	static ArrayList<Long> PRIMENUMBERS = new ArrayList<Long>();
	
	public static void main(String[] args) {
		long i = 2;
		while(i < 2000000) {
			isPrime(i);
			i++;
		}
		
		long total = 0;
		for(long prime : Problem010.PRIMENUMBERS) {
			total += prime;
		}

		System.out.println("The sum of primes up to 2000000 is: " + total);
	}
	
	/**
	 * 
	 * @param num - number tested for prime
	 * @return true if prime
	 * 
	 * Every time a new prime number is found it is added to the ArrayList
	 */
	public static void isPrime(long num) {
		for(int i = 0; i < Problem010.PRIMENUMBERS.size(); i++) {
			//if an i can divide evenly into num it isn't prime
			if(num % Problem010.PRIMENUMBERS.get(i) == 0) {
				return;
			}
		}
		Problem010.PRIMENUMBERS.add(num);
	}

}
