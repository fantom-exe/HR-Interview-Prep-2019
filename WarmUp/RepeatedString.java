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
		final long  LENGTH_OF_S = s.length(),
					N_MOD_A     = n % s.length();
		
		// count number of 'a' in string s
		int numOfa = 0;
		
		for(int i = 0; i < LENGTH_OF_S; i++) {
			if(s.charAt(i) == 'a') {
				numOfa++;
			}
		}
		
		final long NUM_OF_A_IN_S = numOfa;
		
		long repeats = 0; // 
		
		// calculate repeats of 'a'
		if(N_MOD_A == 0) {
			repeats = n * NUM_OF_A_IN_S / LENGTH_OF_S;
		}
		else {
			// n - n % LENGTH_OF_S
			
		}
		
		
		System.out.println(9 * 2/3);
		
		return repeats;
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
