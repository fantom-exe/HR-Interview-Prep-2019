package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class TwoDArrayDS {
	
	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int currHourglassSum = 0, maxHourglassSum = 0;
		
		for(int r = 0; r < 4; r++) { // array ROWs
			for(int c = 0; c < 4; c++) { // array COLs
				// hourglass
				for(int t = r, b = t+2, i = c; i < c+3; i++) { // top & bottom COLs
					
					currHourglassSum += arr[t][i]; // add top
					
					currHourglassSum += arr[b][i]; // add bottom
					
					
					System.out.println("t: " + t);
					System.out.println("b: " + b);
					
					System.out.println("arr[t][i]: " + arr[t][i]);
					System.out.println("arr[b][i]: " + arr[b][i]);
					
				}
				
				currHourglassSum += arr[r+1][c+1]; // add mid
				
				System.out.println("arr[r+1][c+1]: " + arr[r+1][c+1]);
				
				// determine max sum
				if(currHourglassSum >= maxHourglassSum) {
					maxHourglassSum = currHourglassSum;
				}
				
				System.out.println("currHourglassSum: " + currHourglassSum);
				
				// reset currHourglassSum
				currHourglassSum = 0;
			}
			
		}
		
		return maxHourglassSum;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
		int[][] arr = new int[6][6];
		
		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			
			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}
		
		int result = hourglassSum(arr);
		System.out.println(result);
		
//		bufferedWriter.write(String.valueOf(result));
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();
		
		scanner.close();
	}

}
