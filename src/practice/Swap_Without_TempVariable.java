package practice;

public class Swap_Without_TempVariable {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		System.out.println("Before swapping i value "+i+" and j is "+j+" ");
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("The values of i is "+i+" and j is "+j);
	}

}
