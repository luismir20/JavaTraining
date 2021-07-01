package day2.ex2;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Luis", "Thinker", 5000.99);
		Employee emp2 = new Employee("You", "Dreamer", 5000.99);

		System.out.println("1st Employee's first name: " + emp1.getFirstName());
		System.out.println("1st Employee's last name: " + emp1.getLastName());
		System.out.println("1st Employee's monthly salary: " + emp1.getMonthlySalary());
		System.out.println();

		System.out.println("2nd Employee's first name: " + emp2.getFirstName());
		System.out.println("2nd Employee's last name: " + emp2.getLastName());
		System.out.println("2nd Employee's monthly salary: " + emp2.getMonthlySalary());
		System.out.println();

		emp1.setMonthlySalary(1.1 * emp1.getMonthlySalary());
		emp2.setMonthlySalary(1.1 * emp2.getMonthlySalary());

		System.out.println("1st Employee's monthly salary after a 10% raise:" + emp2.getMonthlySalary());
		System.out.println("2nd Employee's monthly salary after a 10% raise:" + emp2.getMonthlySalary());

	}

}
