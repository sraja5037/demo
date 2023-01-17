package practice;

public class Employee_Controller {

	public static void main(String[] args)throws CloneNotSupportedException  {
		final Address address = new Address(100, "Hyderabad");
        final Employee employee = new Employee("Raja", 200, address);

        System.out.println(" Before changes to object : " + employee.toString());
        
        address.setAddress("mumbai");
        
        System.out.println("After Changing The Address"+employee.toString());
	}

}
