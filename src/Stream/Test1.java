package Stream;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
	public static void main (String[]args) {
		int[]a = {1,2,3,4};
		int[]b = {6,2,3,5};
		ArrayList<Integer>results = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			boolean foundB = false;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					foundB = true;
					break;
				}
			}
			if(!foundB) {
				results.add(a[i]);
				
			}
			
				
			}
		for(int i=0;i<b.length;i++) {
			boolean foundA = false;
			for(int j=0;j<a.length;j++)  {
			  if(b[i]==a[j]) {
				  foundA= true;
				  break;
			  }
			}
			if(!foundA) {
				results.add(b[i]);
			}
		}
		int[]output = new int[results.size()];
		for(int i=0;i<results.size();i++) {
			output[i]= results.get(i);
		}
		Arrays.sort(output);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]+" ");
		}
	
	}

	
		
	}


