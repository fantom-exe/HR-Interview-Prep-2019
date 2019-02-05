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
		ArrayList alist = new ArrayList();
		int index = 0, sock = 0, pairs = 0;
		
		do {
			alist.add(ar[index]);
		} while(index < n);
		
		for(int i = 0; i < ar.length; i++) {
			
			for(int j = i+1; j < ar.length-1; j++) {
				
				if(alist.contains(ar[i])) {
					pairs++;
				}
			}
		}
		
		return pairs;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
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
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}
}
