package leetcode295;

import java.util.Arrays;

public class Main {
	 public static void main(String[] args) {
		 int[] num = {4,2,1,3,5,6};
		 
		 MedianFinder obj = new MedianFinder();
		 
		 for(int i : num){
			 obj.addNum(i); 
		 }
		 
		 Arrays.sort(num);
		 
		 System.out.println("input: " + Arrays.toString(num));
		 
		 double param_2 = obj.findMedian();
		 
		 System.out.println("Solution: " + param_2);
	}
}
