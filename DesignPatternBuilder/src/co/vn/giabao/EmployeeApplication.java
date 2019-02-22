package co.vn.giabao;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee.EmployeeBuilder(1, "Tien", "Nguyen")
				.build();
		Employee emp2 = new Employee.EmployeeBuilder(2, "Bao", "Gia")
				.address("Hanoi")
				.age(7)
				.build();
		
		System.out.println("Empoyee 1: " + emp1.toString());
		System.out.println("Empoyee 2: " + emp2.toString());
		
	}
}
