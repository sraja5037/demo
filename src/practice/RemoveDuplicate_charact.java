package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicate_charact {
  
	  public static void removeDuplicates(String str)   
	    {       
		  str=str.toLowerCase();
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        for(int i=0;i<str.length();i++)   
	            set.add(str.charAt(i));
	        
	        for(Character ch : set)   
	            System.out.print(ch);   
	    }   
	        
	    public static void main(String args[])   
	    {     
	        removeDuplicates("Antra");   
	    }   
}
