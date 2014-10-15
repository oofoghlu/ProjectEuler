import java.math.BigInteger;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find the sum of the digits of 2 to the power 1000
 * 
 */

public class Problem016 {

	public static void main(String[] args) {
		BigInteger num = new BigInteger("2").pow(1000);
		System.out.println(num);
		String numString = num + "";
		
		int total = 0;
		for(int i = 0; i < numString.length(); i++) {
			total += Integer.parseInt(numString.charAt(i) + "");
		}
		
		System.out.println("Sum of digits is: " + total);

	}

}
