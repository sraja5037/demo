package practice;

public class String_Comparision {
	public static String Comp(String str) {
		String str1="";
		String str2="";
		for(int i=0;i<str.length()-1;i++) {
			int count=0;
			for(int j=0;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		if(!str2.contains(str.valueOf(str.charAt(i)))) {
			str1=str1+str.charAt(i)+count;
		}
		str2=str2+str.charAt(i);
	}
		return str1;
	}
	public static void main(String[] args) {
		System.out.println(String_Comparision.Comp("abbccdddd"));
	}

}
