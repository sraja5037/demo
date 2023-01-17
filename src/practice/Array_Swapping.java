package practice;

public class Array_Swapping {
 static int firstArr(int a[],int i,int j) {
	 int a[]= {1,2,3,4,5,6,7,8};
	 int reverse[];
	  i=0;
	  j=a.length-1;
	 while (i<j) {
		 int temp=a[i];
		 a[i]=a[j];
		 a[j]=temp;
		 i++;
		 j--;
	}
	return a[j];
 }
 public static void main(String []args) {
	 firstArr();
	 
 }
}
