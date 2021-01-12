
import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> toSort = new ArrayList<Integer>();
		
		int x;
		for(int i=0;i<16;i++) {
			x=(int) (Math.random()* (99999 - 3 + 1) + 3);
			toSort.add(x);
		}
		
		System.out.println("Unsorted List : "+toSort.toString());
		
		int i,c,j=0;
		for(j=0;j<toSort.size()-1;j++) {
			
			for(i=0;i<toSort.size()-1;i++)
			{		
				
					if((toSort.get(i)>toSort.get(i+1))) {
						c=toSort.get(i);
						toSort.set(i, toSort.get(i+1));
						toSort.set(i+1, c);
					}
					
				
				
			}	
			
		}
		
		
		System.out.println("Sorted List : "+toSort.toString());
		
	}

}
