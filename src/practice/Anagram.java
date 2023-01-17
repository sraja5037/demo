package practice;

import java.util.Arrays;

public class Anagram {

	public static boolean anagram(String s1,String s2) {
		  String str1 = s1.replaceAll("", "");  
	        String str2 = s2.replaceAll("", "");  
	        boolean status = true;  
	        if (s1.length() != s2.length()) {  
	            status = false;  
	        } else {  
	            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
	            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
	            Arrays.sort(ArrayS1);  
	            Arrays.sort(ArrayS2);  
	            status = Arrays.equals(ArrayS1, ArrayS2);  
	        }  
	        if (status) {  
	            System.out.println(s1 + " and " + s2 + " are anagrams");  
	        } else {  
	            System.out.println(s1 + " and " + s2 + " are not anagrams");  
	        }
			return status;    
	}
	public static void main(String[] args) {
		anagram("madam","aadmm");
	}
}
