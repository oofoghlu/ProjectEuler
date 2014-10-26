/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Problem to find the number of letters in numbers 1 - 1000
 * 
 */

public class Problem017 {

	public static int numLetters(int i) {
		String num = i + "";
		int total = 0;
		if(num.length() == 4)
			return "one".length() + "thousand".length();
		else if(num.length() == 3) {
			total += getWordLength(num.charAt(0) - '0') + "hundred".length();
			if((i % 100) != 0)
				total += "and".length();
		}
	
		if(num.length() >= 2) {
			if((i % 100) < 20 && (i % 100) > 9)
				return total + getSpecial(num.substring(num.length() - 2));
			if(num.charAt(num.length() - 2) != '0')
				total += getTy((num.charAt(num.length() - 2)) - '0');
		}
		
		return total + getWordLength((num.charAt(num.length() - 1)) - '0');
			
	}
	
	public static int getTy(int i) {
		if(i == 2)
			return "twenty".length();
		else if(i == 3)
			return "thirty".length();
		else if(i == 4)
			return "forty".length();
		else if(i == 5)
			return "fifty".length();
		else if(i == 6)
			return "sixty".length();
		else if(i == 7)
			return "seventy".length();
		else if(i == 8)
			return "eighty".length();
		else if(i == 9)
			return "ninety".length();
		else
			return 0;
	}
	
	public static int getSpecial(String num) {
		int i = Integer.parseInt(num);
		if(i == 10)
			return "ten".length();
		else if(i == 11)
			return "eleven".length();
		else if(i == 12)
			return "twelve".length();
		else if(i == 13)
			return "thirteen".length();
		else if(i == 14)
			return "fourteen".length();
		else if(i == 15)
			return "fifteen".length();
		else if(i == 16)
			return "sixteen".length();
		else if(i == 17)
			return "seventeen".length();
		else if(i == 18)
			return "eighteen".length();
		else if(i == 19)
			return "nineteen".length();
		else
			return 0;
	}
	
	public static int getWordLength(int i) {
		if(i == 1)
			return "one".length();
		else if(i == 2)
			return "two".length();
		else if(i == 3)
			return "three".length();
		else if(i == 4)
			return "four".length();
		else if(i == 5)
			return "five".length();
		else if(i == 6)
			return "six".length();
		else if(i == 7)
			return "seven".length();
		else if(i == 8)
			return "eight".length();
		else if(i == 9)
			return "nine".length();
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int totalLetters = 0;
		for(int i = 1; i <= 1000; i++) {
			int temp = numLetters(i);
			System.out.println(i + ": " + temp);
			totalLetters += temp;
		}
		
		System.out.println(totalLetters);

	}

}
