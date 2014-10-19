import java.math.BigInteger;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find the sum of the digits in 100!
 * 
 */

public class Problem020 {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("1");
		for(int i = 100; i > 0; i--) {
			num = num.multiply(new BigInteger(i + ""));
		}
		
		String numString = num + "";
		
		int total = 0;
		for(int i = 0; i < numString.length(); i++) {
			total += Integer.parseInt(numString.charAt(i) + "");
		}
		
		System.out.println("Sum of digits is: " + total);

	}

}
