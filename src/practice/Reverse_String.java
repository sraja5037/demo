package practice;

public class Reverse_String {
	public static void main(String[] args) {
		String str="Antra info solutions  pvt lmtd";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}
}
