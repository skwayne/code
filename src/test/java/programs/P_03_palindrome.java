package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class P_03_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String input = "INDIA"; 
		String output = "";
		
	for(int i =input.length()-1;i>=0;i--)
	{
        output = output + input.charAt(i);
        
		
	}
	
	System.out.println(input + " and "+ output);
		
        if(input.equalsIgnoreCase(output))
        {
        	System.out.println("Palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome");
        }
     
  
        
        
        
        
		
	}

}
