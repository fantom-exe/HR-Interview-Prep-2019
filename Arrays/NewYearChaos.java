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
		boolean chaotic = false;
		int person, nextPerson, briber, numOfBribes = 0;
		
		for(int i = 0; i < q.length-1; i++) {
			person = q[i];
			nextPerson = q[i+1];
			
			if(person+1 != nextPerson) { // possible bribe
				briber = nextPerson;
				numOfBribes++;
				
				if(briber+1 == ) {
				
				}
			}
			
			if() {
				chaotic = true;
			}
		}
		
		System.out.println(numOfBribes);
		
		if(chaotic) { // chaotic
			System.out.println("Too chaotic");
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
