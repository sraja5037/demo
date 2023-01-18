package practice;

public class Beta  extends Alpha{
	 public void foo(String a) {
	    	System.out.println("Beta foo");
	    }
	    public void bar(String a) {
	    	System.out.println("beta bar");
	    }
     public static void main(String[] args) {
		Alpha a = new Alpha();
		Beta b =new Beta();
		a.foo("test");b.foo("test");
		a.foo("test");b.bar("test");
	}
}
