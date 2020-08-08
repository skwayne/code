package programs;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class P_01_stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s = "INDIA";

		char[] d = s.toCharArray(); 

		ArrayList<Character> r = new ArrayList<Character>();



		for(Character c : d)
		{
			r.add(c);

		}


		Collections.reverse(r);
		
		//System.out.println(r);

		Iterator<Character> itr = r.iterator();

		while(itr.hasNext())

		{
			System.out.print(itr.next());
			
		}



	}

}
