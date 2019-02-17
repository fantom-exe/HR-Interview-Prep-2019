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
				for(int t = r, b = t+2; c < 3; t++, b++, c++) { // top & bottom COLs
					
					currHourglassSum += arr[t][m]; // add top
					
					currHourglassSum += arr[b][m]; // add bottom
					
				}
				
				currHourglassSum += arr[r+1][c+1]; // add mid
			}
			
			// determine max sum
			if(currHourglassSum >= maxHourglassSum) {
				maxHourglassSum = currHourglassSum;
			}
			
			// reset currHourglassSum
			currHourglassSum = 0;
		}
		
		return maxHourglassSum;
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		
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
		
		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();
		
		bufferedWriter.close();
		
		scanner.close();
	}

}
