/**
 * @author oofoghlu
 * @version 1.0
 */
import java.util.ArrayList;


public class Problem001 {
	
	public static void main(String[] args) {
		
		ArrayList<Double> multiples3or5 = new ArrayList<Double>();
		
		//checking all numbers below 1000
		for (double i = 1; i < 1000; i++) {
			
			//checking if number is multiple of 3 or 5
			if ((i / 5) % 1 == 0 || (i / 3) % 1 == 0)
				multiples3or5.add(i);
		}
		
		int total = 0;
		
		for (double num : multiples3or5) {
			total += num;
		}
		
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is: " + total);
	}
}
