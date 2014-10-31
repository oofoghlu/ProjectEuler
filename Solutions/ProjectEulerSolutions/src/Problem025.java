import java.math.BigInteger;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find the first 1000 digit fibonacci number
 * 
 * 
 */

public class Problem025 {

	public static void main(String[] args) {
		long current = 3l;
		BigInteger last2 = new BigInteger("1");
		BigInteger last1 = new BigInteger("2");
		
		while(true) {
			current++;
			BigInteger temp = last1.add(last2);
			last2 = last1;
			last1 = temp;
			if(last1.toString().length() >= 1000)
				break;
		}
		
		System.out.println("The first 1000 digit fibonacci number is: " + current);
	}

}
