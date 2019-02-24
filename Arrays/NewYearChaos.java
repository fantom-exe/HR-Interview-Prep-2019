package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NewYearChaos {
	
	private static boolean chaotic = false;
	private static int totalBribes = 0;
	
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int person, nextPerson, currentBribes = 0;
		
		for(int i = 0; i < q.length-1; i++) { // queue counter
			person = q[i];
			
			for(int j = i+1; j < q.length; j++) { // bribe counter
				nextPerson = q[j];
				
				System.out.println("person: " + person);
				System.out.println("nextPerson: " + nextPerson);
				
				System.out.println("**currentBribes: " + currentBribes);
				System.out.println("**totalBribes: " + totalBribes);
				System.out.println();
				
				if(currentBribes > 2) { // more than 2 bribes
					chaotic = true;
					currentBribes = 0; // reset bribe counter
					break;
				}
				else if(person > nextPerson) { // bribe occurred
					currentBribes++;
					
					if(person-1 == nextPerson) {
						break;
					}
				}
				
			} // END for - bribe counter
			
			if(!chaotic) {
				totalBribes += currentBribes;
			}
			else {
				break;
			}
			
		} // END for
		
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
		
		// outputs
		System.out.println(totalBribes);
		
		if(chaotic) { // chaotic
			System.out.println("Too chaotic");
		}
		
		scanner.close();
	}
}
