package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class NewYearChaos {
	
	private static boolean chaotic       = false;
	private static int     minimumBribes = 0;
	
	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int person, nextPerson, tempBribes = 0, totalBribes = 0;
		boolean wasChaotic = false;
		
		for(int i = 0; i < q.length-1; i++) { // queue counter
			person = q[i];
			
			for(int j = i+1; j < q.length; j++) { // bribe counter
				nextPerson = q[j];
				
				if(person > nextPerson) { // bribe occurred
					tempBribes++;
				}
				
				if(tempBribes > 2) { // more than 2 bribes
					wasChaotic = true;
					tempBribes = 0; // reset bribe counter
					break;
				}
				
				System.out.println("person: " + person);
				System.out.println("nextPerson: " + nextPerson);
				
				System.out.println("**tempBribes: " + tempBribes);
				System.out.println("**totalBribes: " + totalBribes);
				System.out.println("wasChaotic: " + wasChaotic);
				System.out.println();
				
			} // END for - bribe counter
			
			totalBribes += tempBribes;
			tempBribes = 0; // reset bribe counter
			
		} // END for
		
		if(!wasChaotic) {
			minimumBribes += totalBribes;
		}
		else {
			chaotic = true;
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
		System.out.println(minimumBribes);
		
		if(chaotic) { // chaotic
			System.out.println("Too chaotic");
		}
		
		scanner.close();
	}
}
