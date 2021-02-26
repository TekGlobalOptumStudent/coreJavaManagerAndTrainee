package coreJavaManagerAndTrainee;

public class Assignment7 {

	public static void main(String[] args) {
		
		// test case 1
		System.out.println("Test case 1");
		Manager manager = new Manager(126534L, "Peter", "Chennia India", 237844L, 65000.0);
		manager.calculateSalary();
		
		// test case 2
		System.out.println("Test case 2");
		Trainee trainee = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000.0);
		trainee.calculateSalary();
		
		// problem statement 2 4
		manager.calculateTransportAllowance();
		trainee.calculateTransportAllowance();
	}
	
}

class Employee {
	
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
	public Employee() {
	}
	
	public Employee(long id, String name, String address, long phone) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}
	
	public void calculateSalary() {
		double salary = basicSalary + (basicSalary + (specialAllowance/100)) + (basicSalary * (hra/100));
		System.out.println("salary is " + salary);
	}
	
	public void calculateTransportAllowance() {
		System.out.println("employee transport allowance is " + (0.1 * basicSalary));
	}
}

class Manager extends Employee {
	
	public Manager() {
		super();
	}
	
	public Manager(long id, String name, String address, long phone, double basicSalary) {
		super(id, name, address, phone);
		this.basicSalary = basicSalary;
	}
	
	public void calculateTransportAllowance() {
		System.out.println("manager transport allowance is " + (0.15 * basicSalary));
	}
}

class Trainee extends Employee {
	
	public Trainee() {
		super();
	}
	
	public Trainee(long id, String name, String address, long phone, double basicSalary) {
		super(id, name, address, phone);
		this.basicSalary = basicSalary;
	}
}