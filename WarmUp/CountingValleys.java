package WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class CountingValleys {
	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int valleys = 0, seaLevel = 0;
		
		while(n >= 0) {
			
			if(s.charAt(Math.abs(1-n)) == 'U') { // reading string backwards using n as index
				seaLevel++;
			}
			else {
				seaLevel--;
			}
			
			if(seaLevel == 0) {
				valleys++;
			}
			
			n--; // index
		}
		
		return valleys;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		String s = scanner.nextLine();
		
		int result = countingValleys(n, s);
		
		System.out.println(result);
		
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
		
		scanner.close();
	}
}

