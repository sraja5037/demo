package practice;

public class DuplicateWord {

	public static void main(String[] args) {
		String str="Antra";
		int count;
		str=str.toLowerCase();
		String words[]=str.split("");
		System.out.println("Duplicate Words in Given String");
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) { 
				count++;
				  words[j] = "0"; 
			}
			
		}
		if(count>1 && words[i]!="0") {
			System.out.println(words[i]);
		}
		}
	}
}
