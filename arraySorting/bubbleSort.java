/**
 * 
 */
package arraySorting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author Aman
 *
 */
public class bubbleSort {
	public static void main(String args[]) {
		Result result = JUnitCore.runClasses(bubbleTest.class); 
		int[] arr = {45,78,9,10,100,1,2,23,32,12};
		bubbleSort bubbleSort = new bubbleSort();
		arr=bubbleSort.sortedArray(arr);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
	public int[] sortedArray(int[]arr) {
		int a=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1] > arr[j]) {
					a=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=a;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");  
		}
		return arr;
	}
}
