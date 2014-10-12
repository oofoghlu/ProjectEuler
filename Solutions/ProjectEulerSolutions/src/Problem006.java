/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to the difference between the square of the sum of 1-100 vs. the the sum of 1-100 squared
 */
public class Problem006 {
	
	public static void main(String[] args) {
		int square1 = 0;
		int square2 = 0;

		for(int i = 1; i <= 100; i++) {
			square1 += i;
			square2 += (i * i);
		}
		square1 *= square1;
		
		System.out.println("The difference is: " + Math.abs(square1 - square2));
	}
}
