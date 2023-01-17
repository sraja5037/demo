package practice;

public class Employee {
	private final String name;
	private final int id;
	private final Address address;
	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = (Address) address.clone();
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Address getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
}
