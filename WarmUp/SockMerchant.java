package WarmUp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SockMerchant {
	
	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		ArrayList colorVariations = new ArrayList();
		int socks = 0, color, pairs = 0;

		// find possible color variations
		for(int i = 0; i < n; i++, socks = 0) {
			color = ar[i];
			
			// check if color pair already counted
			if(!colorVariations.contains(color)) {
				colorVariations.add(color);
				
				for(int j = i; j < n; j++) {
					if(color == ar[j]) {
						socks++;
					}
				}
				
				pairs += socks / 2;
			}
			
		}
		
		return pairs;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		int[] ar = new int[n];
		
		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}
		
		int result = sockMerchant(n, ar);
		
		System.out.println(result);
		
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
		
		scanner.close();
	}
}
