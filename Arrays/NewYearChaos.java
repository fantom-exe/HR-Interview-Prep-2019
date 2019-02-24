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
		int person, nextPerson, tempBribes, totalBribes = 0;
		
		for(int i = 0; i < q.length-1; i++) { // queue counter
			person = q[i];
			tempBribes = 0; // reset bribe counter
			
			for(int j = i+1; j < q.length; j++) { // bribe counter
				nextPerson = q[j];
				
				System.out.println("person: " + person);
				System.out.println("nextPerson: " + nextPerson);
				
				System.out.println("**tempBribes: " + tempBribes);
				System.out.println("**totalBribes: " + totalBribes);
				System.out.println();
				
				if(tempBribes > 2) { // more than 2 bribes
					chaotic = true;
					break;
				}
				else if(person > nextPerson) { // bribe occurred
					tempBribes++;
					
					if(person-1 == nextPerson) { // for efficiency
						break;
					}
				}
				
			} // END for - bribe counter
			
			if(!chaotic) {
				totalBribes += tempBribes;
			}
			else {
				break;
			}
			
		} // END for
		
		minimumBribes += totalBribes;
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
