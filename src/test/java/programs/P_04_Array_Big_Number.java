package programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P_04_Array_Big_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i[] = { 1,33,44,55,2,3};
		
		List<Integer> li = new LinkedList<Integer>();
		
		for(int k : i)
		{
		
			li.add(k);
			
		}
		
		Collections.sort(li);
		
		System.out.println(li.get(li.size()-1));
	}

}
