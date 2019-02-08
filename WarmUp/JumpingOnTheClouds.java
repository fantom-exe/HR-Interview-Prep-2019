package WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class JumpingOnTheClouds {
	
	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {
		int jumps = 0;
		
		for(int i = 0; i < c.length - 1;) {
			// i = position
//			if(c[i] == 0) { // ... 0 ...
//				if(i+1 == c.length) { // ... 0
//					break;
//				}
				
				if(c[i+1] == 0) { // ... 0 0 ...
					if(i+2 < c.length && c[i+2] == 0) { // ... 0 0 0 ...
						jumps+=1;
						i+=2;
					}
					else { // ... 0 0 1 ... or ... 0 0
						jumps+=1;
						i+=1;
					}
				}
				else { // ... 0 1 ...
					jumps+=1;
					i+=2;
				}
//			}
//			else { // ... 1 ...
//				jumps+=1;
//				i+=1;
//				System.out.println("DAMN!");
//			}
		
		}
	
		return jumps;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] c = new int[n];
		
		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}
		
		int result = jumpingOnClouds(c);
		
		System.out.println(result);
		
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
		
		scanner.close();
	}

}
