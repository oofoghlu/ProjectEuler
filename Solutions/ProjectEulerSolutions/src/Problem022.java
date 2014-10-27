import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author oofoghlu
 * @version 1.0
 * 
 * Name scores sum
 * 
 */

public class Problem022 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		File nameFile = new File("p022_names.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
			//Putting names from file to array
			String line = br.readLine();
			line = line.substring(1, line.length() - 1);
			String split = "\",\"";
			String[] names = line.split(split);
			
			//Sorting array
			ArrayList<String> namesOrd = new ArrayList<String>();
			for(int name = 0; name < names.length; name++) {
				namesOrd.add(names[name]);
			}
			Collections.sort(namesOrd);
			
			BigInteger total = new BigInteger("0");
			for(int i = 0; i < namesOrd.size(); i++) {
				int sumLetters = 0;for(int j = 0; j < namesOrd.get(i).length(); j++) {
					sumLetters += (int)namesOrd.get(i).charAt(j) - 64;
				}
				total = total.add(BigInteger.valueOf((sumLetters * (i + 1))));
			}
			System.out.println(total.toString());
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		
		

		
	}

}
