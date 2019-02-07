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
		int i = 0, valleys = 0, altitude = 0;
		boolean inValley = false;
		
		while(i < n) {
			if(s.charAt(i) == 'U') {
				altitude++;
			}
			else {
				if(altitude == 0) { // entered a valley
					inValley = true;
				}
				
				altitude--;
			}
			
			if(inValley && altitude == 0) {
				valleys++;
				inValley = false;
			}
			
			i++; // index
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

