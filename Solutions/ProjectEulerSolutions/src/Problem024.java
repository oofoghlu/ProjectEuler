import java.util.ArrayList;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Find the 1000000th lexicographic permutation of "0123456789"
 * 
 * 
 */


public class Problem024 {

	static ArrayList<String> lex = new ArrayList<String>();
	
	public static void permute(String pre, String left) {
		if(left.length() == 0)
			lex.add(pre);
		else {
			for(int i = 0; i < left.length(); i++) {
				permute(pre + left.charAt(i), left.substring(0, i) + left.substring(i+ 1));
			}
		}
	}
	
	public static void main(String[] args) {
		String all = "0123456789";
		permute("", all);
		
		System.out.println(lex.get(999999));
	}

}
