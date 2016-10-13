/*
Code developed by Abuzar and Mihir.#ZTF
*/
package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Answer { 
	
	public static void main(String...strings){
		ArrayList<Integer> t = new ArrayList<Integer>();
		 int[] inputArr = {2,3,4,5,5,5,6,2,9,85,32,32,32};
		 int[] o = answer(inputArr, 3);
		for(int i=0;i<o.length;i++){
			t.add(o[i]);
		}
		System.out.println(t);
	}
    public static int[] answer(int[] data, int n) { 
        
        int count = 0;
        ArrayList<Integer> repeated = new ArrayList<Integer>(); 
        ArrayList<Integer> t = new ArrayList<Integer>();
        ArrayList<Integer> out = new ArrayList<Integer>();
		if(n==0)
		{
			return new int[0];
		}
		else
		{
			for(int i=0;i<data.length;i++){
	            t.add(data[i]);
	        }
	        Collections.sort(t);
	        int prev = 0;
	        for(int i=0;i<data.length;i++){
	            if(t.get(i).equals(prev))
	            {
	            	count++;
	            }
	            else if(count<n && !t.get(i).equals(prev)){
	            	count = 0;
	            }
	            prev = t.get(i);
	            if(count==n){
	            	repeated.add(t.get(i));
	            	count=0;
	            }
	        }
	        
	        //System.out.println(repeated);
	        for(int number:data){
	        	if(repeated.contains(number)){
	        		
	        	}
	        	else{
	        		out.add(number);
	        	}
	        }
	        int[] o = new int[out.size()];
	        for(int i=0;i<out.size();i++){
	        	o[i]=out.get(i);
	        }
	        return o;
		}
        

    } 
}
