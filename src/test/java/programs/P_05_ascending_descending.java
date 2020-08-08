package programs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P_05_ascending_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int i[] = { 1,33,44,55,2,3};

		List<Integer> li = new LinkedList<Integer>();

		for(int k : i)
		{

			li.add(k);

		}

		Collections.sort(li);
		Collections.reverse(li);

		ListIterator v = li.listIterator();

		System.out.println("Printing in descending order");
		while(v.hasNext())
		{
			System.out.println(v.next());
		}


//		ListIterator v1 = li.listIterator();

		System.out.println("Printing in ascending order");
//		while(v1.hasNext())
		{
//			System.out.println(	v1.next());
		}



//		System.out.println(li.get(li.size()-1));
	}

}
