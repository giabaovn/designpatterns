package co.vn.giabao;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String phone;
	private String address;

	public Employee(EmployeeBuilder employeeBuilder) {
		this.id = employeeBuilder.id;
		this.firstName = employeeBuilder.firstName;
		this.lastName = employeeBuilder.lastName;
		this.age = employeeBuilder.age;
		this.phone = employeeBuilder.phone;
		this.address = employeeBuilder.address;
	}

   // Getter and Setter

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", phone='" + phone + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public static class EmployeeBuilder {

		private int id;
		private String firstName;
		private String lastName;
		private int age;
		private String phone;
		private String address;

		public EmployeeBuilder(int id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public EmployeeBuilder age(int age) {
			this.age = age;
			return this;
		}

		public EmployeeBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public EmployeeBuilder address(String address) {
			this.address = address;
			return this;
		}

		public Employee build() {
			return new Employee(this);
		}
	}
}