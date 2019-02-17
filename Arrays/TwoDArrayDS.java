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
		
		for(int i = 0, c = 1; i < 3; i++, c++) { // ROW of entire array
			
			// hourglass
			for(int t = i, b = t+2; t < 3 && b < 6; t++, b++) { // top & bottom ROWS
				
				maxHourglassSum += arr[t][c]; // calc top
				
				maxHourglassSum += arr[b][c]; // calc bottom
				
				for(int m = 1, c = 0; m < 6; m++) { // hourglass middle
					maxHourglassSum += arr[b][c];
				}
				
			}
			
			// determine max sum
			if(currHourglassSum >= maxHourglassSum) {
				maxHourglassSum = currHourglassSum;
			}
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
