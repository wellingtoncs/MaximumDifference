package com.wcs.diff;

public class MaximumDifference {
	
	 // Complete the maxDifference function below.
    static int maxDifference(int[] a) {
    	
    	if (a == null || a.length < 2) {
    		return -1;
    	}    	
    	
    	int diff = 0;    	
        int i, j; 
        for (i = 0; i < a.length; i++)  
        { 
            for (j = i + 1; j < a.length; j++) 
            { 
            	int current = 0;
            	if (a[j] > a[i]) {
            		current = a[j] - a[i];
            	}
            	
                if (current > diff) {
                	
                	diff = current; 
                }
            } 
        } 

        return diff;	
    }
}
