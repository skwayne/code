package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P_02_duplicate {

	public static  char p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		String s = "KARTHIKEYAN";
		char[] d = s.toCharArray(); 
		ArrayList<Character> r = new ArrayList<Character>();


		for(Character c : d)
		{
			r.add(c);

		}
		Iterator<Character> itr = r.iterator();

		for(int i=0;i<d.length;i++)
		{
			int count =0;
			
			while(itr.hasNext())
			{
				if(itr.next().equals(d[i]))
				count++;
				
			}
			itr=r.iterator();
			
			if(count>1)
			{
				System.out.println(d[i]);
			}
		}
		
		
		
	

	}

}
