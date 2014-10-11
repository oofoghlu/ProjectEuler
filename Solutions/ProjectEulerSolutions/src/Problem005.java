/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find smallest number divisible by all of 1-20
 */
public class Problem005 {
	public static void main(String[] args) {
		boolean found = false;
		int num = 19;
		while(!found) {
			num++;
			for(int i = 1; i <= 21; i++) {
				if(i == 21) {
					found = true;
				}
				if(num % i == 0) {
					continue;
				}
				break;
			}			
		}
		System.out.println("Smallest number divisible by all of 1-20 is: " + num);
	}
}
