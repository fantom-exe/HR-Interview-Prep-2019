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
					N_MOD_A     = n % LENGTH_OF_S;
		int         counter     = 0;
		
		// count number of 'a' in string s
		for(int i = 0; i < LENGTH_OF_S; i++) {
			if(s.charAt(i) == 'a') {
				counter++;
			}
		}
		
		final long NUM_OF_A_IN_S = counter;
		
		System.out.println(Math.max(LENGTH_OF_S, N_MOD_A));
		
		// calculate number of letter 'a' in the first n letters of the repeated string
		long numOfA = 0;
		
		if(N_MOD_A != 0) {
			String newStr = s;
			
			if(LENGTH_OF_S < N_MOD_A) { // multiply size of s and copy to newStr
				for(int i = 0; i < (1 + N_MOD_A / LENGTH_OF_S); i++) {
					newStr += s;
				}
			}
			
			// count number of 'a' in newStr
			for(int i = 0; i < N_MOD_A; i++) {
				if(newStr.charAt(i) == 'a') {
					numOfA++;
				}
			}
			
			numOfA = numOfA + n * NUM_OF_A_IN_S / LENGTH_OF_S;
		}
		else {
			numOfA = n * NUM_OF_A_IN_S / LENGTH_OF_S;
		}
		
		return numOfA;
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
