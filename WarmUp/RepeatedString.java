package WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class RepeatedString {
	
	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		final long  LENGTH_OF_S = s.length();
		long        n_mod_s, numOfa = 0;
		
		// count number of 'a' in string s
		for(int i = 0; i < LENGTH_OF_S; i++) {
			if(s.charAt(i) == 'a') {
				numOfa++;
			}
		}
		
		if(n < LENGTH_OF_S) { // return already counted number of 'a' in s
			return numOfa;
		}
		else { // continue ...
			n_mod_s = n % LENGTH_OF_S;
		}
		
		//
		if(n_mod_s != 0) {
			// count number of 'a' in newStr
			for(int i = 0; i < n_mod_s; i++) {
				if(s.charAt(i) == 'a') {
					numOfa++;
				}
			}
			
			numOfa = numOfa + n * numOfa / LENGTH_OF_S;
		}
		else {
			numOfa = n * numOfa / LENGTH_OF_S;
		}
		
		return numOfa;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		String s = scanner.nextLine();
		
		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		long result = repeatedString(s, n);
		
		System.out.println(result);
		
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
		
		scanner.close();
	}

}
