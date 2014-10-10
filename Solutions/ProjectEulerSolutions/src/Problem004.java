import java.util.ArrayList;
import java.util.Collections;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find largest palindrome of the product of two 3-digit numbers
 */
public class Problem004 {
	
	public static void main(String args[]) {
		
		ArrayList<String> palindromes = new ArrayList<String>();
		
		for(int i = 100; i < 999; i++) {
			for(int j = 100; j < 999; j++) {
				int num = i * j;
				String number = num + "";
				if(isPalindrome(number))
					palindromes.add(number);
			}
		}
		
		ArrayList<Integer> intPalindromes = new ArrayList<Integer>();
		for(String n : palindromes) {
			intPalindromes.add(Integer.parseInt(n));
		}
		Collections.sort(intPalindromes);
		System.out.println("The largest palindrome of the product of two 3-digit numbers is: " + intPalindromes.get(intPalindromes.size() - 1));
	}
	
	public static boolean isPalindrome(String number) {
		for(int i = 0, j = number.length() - 1; i < number.length() && j >= 0; i++, j--) {
			if(number.charAt(i) != number.charAt(j))
				return false;
		}
		return true;
	}
}
