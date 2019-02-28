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
		int person, nextPerson, tempBribes = 0, totalBribes = 0, minimumBribes;
		boolean wasChaotic = false;
		
		for(int i = 0; i < q.length-1; i++) { // queue counter
			person = q[i];
			
			for(int j = i+1; j < q.length; j++) { // bribe counter
				nextPerson = q[j];
				
				if(person > nextPerson) { // bribe occurred
					tempBribes += 1;
					
					if(tempBribes > 2) { // more than 2 bribes
						wasChaotic = true;
						break;
					}
				}
//				else if(person + 1 == nextPerson) {
//					break;
//				}
			
			} // END for - bribe counter
			
			if(wasChaotic) {
				System.out.println("Too chaotic");
				break;
			}
			totalBribes += tempBribes;
			tempBribes = 0; // reset bribe counter
			
		} // END for
		
		if(!wasChaotic) {
			minimumBribes = totalBribes;
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
