package leetcode295;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
	private Queue<Integer> smallWithMax;
    
    private Queue<Integer> largeWithMin;
    
    // 0 is even
    private boolean even = true;
    
    /** initialize your data structure here. */
    public MedianFinder() {
    	// A way to have max heap
        smallWithMax = new PriorityQueue<>((a,b) -> b - a);
    
        // The default is min heap
        largeWithMin = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(even){
            largeWithMin.add(num);
            
            // Get the smallest element from large heap
            smallWithMax.add(largeWithMin.poll());
        } else {
            smallWithMax.add(num);
            
            // Get the biggest element from small heap
            largeWithMin.add(smallWithMax.poll());
        }
        
        // Make it no even or even by number of elements
        even = !even;
    }
    
    public double findMedian() {
    	// If even, add both elements and dvide
        if(even){
            return (smallWithMax.peek() + largeWithMin.peek()) / 2.0; 
        } else {
        	// If odd, just get the element
            return smallWithMax.peek();
        }
    }
}
