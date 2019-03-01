package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NewYearChaos {
	
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int person, bribe, minimumBribes = 0;
		boolean isChaotic = false;
		
		for(int i = 0; i < q.length; i++) { // queue counter
			person = q[i];
			bribe  = person - (i+1);
			
			if(bribe > 2) { // too chaotic
				isChaotic = true;
				break;
			}
			else if(bribe >= 0) {
				minimumBribes += bribe;
			}
			
		} // END for
		
		if(isChaotic) {
			System.out.println("Too chaotic");
		}
		else {
			System.out.println(minimumBribes);
		}
		
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			int[] q = new int[n];
			
			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}
			
			minimumBribes(q);
		}
		
		scanner.close();
	}
}
