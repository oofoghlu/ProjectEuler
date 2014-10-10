import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the highest prime factor of number 600851475143
 * 
 * Algorithm -
 * Find lowest prime factor of NUMBER.
 * Then the lpf of the number multiplied by previous lpf to get NUMBER.
 * Continue doing this until all prime factors multiply to give NUMBER.
 * The last prime factor found is the highest.
 * 
 * 
 * Note: unresolved bug-
 * 	does not resolve if prime factors recur.
 * 	not important because problem was for specific number.
 */
public class Problem003 {
	
	static ArrayList<Long> PRIMENUMBERS = new ArrayList<Long>();
	static ArrayList<Long> PRIMEFACTORS = new ArrayList<Long>();
	static final long NUMBER = 600851475143L;
	
	public static void main(String[] args) {
		
		/*This is recursively called - each time finding the lowest prime factor of right branch
		 * until prime factors multiply to give NUMBER
		 */
		hpf(Problem003.NUMBER, 2);
		
		//HPF is the final element of PRIMEFACTORS
		System.out.println("Highest Prime Factor Of " + Problem003.NUMBER + "is: " + Problem003.PRIMEFACTORS.get(Problem003.PRIMEFACTORS.size() -1));
	}
	
	/**
	 * 
	 * @param num - the number of which the lowest prime factor will be found
	 * @param i - the offset from last recursion i.e. the number the last loop finished on. The next prime factor must be higher than the last.
	 */
	public static void hpf(long num, long i) {
		
		while(true) {			
			if(isPrime(i)) {				
				if(num % i == 0) {
					Problem003.PRIMEFACTORS.add(i);
					
					System.out.println("i = " + i + "  -----  Prime Factors: " + Problem003.PRIMEFACTORS + "   ---   Prime Numbers: " + Problem003.PRIMENUMBERS);
					
					//finding product of prime factors. check if equal to NUMBER. return if it is else find next prime factor
					long total = 1L;
					for(long prime : PRIMEFACTORS) {
						total *= prime;
					}
					if(total == Problem003.NUMBER) {
						return;
					}
					else {
						long temp = num / i;
						hpf(temp, i);
						return;
					}
					
				}
			}
			System.out.println("i = " + i + "  -----  Prime Factors: " + PRIMEFACTORS + "   ---   Prime Numbers: " + Problem003.PRIMENUMBERS);
			i++;
		}
	}
	
	/**
	 * 
	 * @param num - number tested for prime
	 * @return true if prime
	 * 
	 * Every time a new prime number is found it is added to the ArrayList
	 */
	public static boolean isPrime(long num) {
		for(int i = 0; i < Problem003.PRIMENUMBERS.size(); i++) {
			//if an i can divide evenly into num it isn't prime
			if(num % Problem003.PRIMENUMBERS.get(i) == 0) {
				return false;
			}
		}
		Problem003.PRIMENUMBERS.add(num);
		return true;
	}
}
