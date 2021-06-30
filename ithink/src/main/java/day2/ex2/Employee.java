package day2.ex2;

public class Employee {

	String firstname;
	String lastname;
	private double monthlySalary;

	Employee(String firstname, String lastname, double monthlySalary) {
		this.firstname = firstname;
		this.lastname = lastname;
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;

		}
	}

	String getFirstName() {
		return firstname;
	}

	void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	String getLastName() {
		return lastname;
	}

	void setLastName(String lastname) {
		this.lastname = lastname;
	}

	double getMonthlySalary() {
		return monthlySalary;
	}

	void setMonthlySalary(double monthlySalary) {
		if (monthlySalary > 0) {
			this.monthlySalary = monthlySalary;
		}
	}
}
