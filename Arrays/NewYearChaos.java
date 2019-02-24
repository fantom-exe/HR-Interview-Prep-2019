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
		
		for(int i = 0; i < q.length; i++) { // queue counter
			person = q[i];
			
			for(int j = i+1; j < q.length; j++) { // bribe counter
				nextPerson = q[j];
				
				System.out.println("person: " + person);
				System.out.println("nextPerson: " + nextPerson);
				
				if(currentBribes > 2) { // more than 2 bribes
					chaotic = true;
					break;
				}
				else if(person > nextPerson) { // bribe occurred
					currentBribes++;
					totalBribes++;
					
					if(person-1 == nextPerson) {
						
					}
					
					System.out.println("currentBribes: " + currentBribes);
					System.out.println("totalBribes: " + totalBribes);
				}
				
			}
			
			currentBribes = 0; // reset temp bribe counter
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
		
		// outputs
		System.out.println(totalBribes);
		
		if(chaotic) { // chaotic
			System.out.println("Too chaotic");
		}
		
		scanner.close();
	}
}
