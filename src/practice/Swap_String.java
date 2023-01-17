package practice;

public class Swap_String {
	public static String exchange(String s,int no) {
		
		String rev="";
		for(int i=s.length()-(no);i<s.length();i++) {
			rev +=s.charAt(i);
		}
		/*
		 * for(int i=0;i<s.length()-(no);i++) { rev +=s.charAt(i); }
		 */
		return rev;
	}
	public static void main(String[] args) {
		/*
		 * System.out.println(exchange("Antra", 1));
		 * System.out.println(exchange("Antra", 2));
		 */
	System.out.println(exchange("Antra", 3));

	}
}
