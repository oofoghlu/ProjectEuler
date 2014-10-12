import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the 10001st prime number
 * 
 * Borrowed some code from Problem003.java
 */
public class Problem007 {

	static ArrayList<Long> PRIMENUMBERS = new ArrayList<Long>();
	
	public static void main(String[] args) {
		
		long i = 2;
		
		while(true) {
			if(Problem007.PRIMENUMBERS.size() == 10001) {
				break;
			}
			isPrime(i);
			i++;
		}
		
		System.out.println("10,001st prime is: " + Problem007.PRIMENUMBERS.get(Problem007.PRIMENUMBERS.size() -1));
	}

	/**
	 * 
	 * @param num - number tested for prime
	 * @return true if prime
	 * 
	 * Every time a new prime number is found it is added to the ArrayList
	 */
	public static void isPrime(long num) {
		for(int i = 0; i < Problem007.PRIMENUMBERS.size(); i++) {
			//if an i can divide evenly into num it isn't prime
			if(num % Problem007.PRIMENUMBERS.get(i) == 0) {
				return;
			}
		}
		Problem007.PRIMENUMBERS.add(num);
	}
}
