/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the pythagorean triplet such that a + b + c = 1000
 * 
 */
public class Problem009 {

	public static void main(String[] args) {
		boolean found = false;
		double a = 1;
		double total;
		while(!found && a < 1000) {
			double b = 1;
			while((total = (a + b + Math.sqrt(((a * a) + (b * b))))) <= 1000) {
				if(total == 1000) {
					System.out.println("a:" + a + " b:" + b + " c:" + Math.sqrt(((a * a) + (b * b))) );
					System.out.println("Product of pythagorean triplet is: " + (a * b * Math.sqrt(((a * a) + (b * b)))));
					found = true;
					break;
				}
				System.out.println("a:" + a + " b:" + b + " c:" + Math.sqrt(((a * a) + (b * b))) + " total:" + total);
				b++;
			}
			a++;
		}
	}

}
