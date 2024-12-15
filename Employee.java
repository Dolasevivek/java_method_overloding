package com.mcq;

public class Employee {
/* instance variables*/
	private int employeeid;
	private String employeename;
	private double salary;
	private double hraper;
	private double daper;
	
	/* parameterized constructor to initalize the instance variables*/
	public Employee(int employeeid, String employeename, double salary, double hraper, double daper) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
		this.hraper = hraper;
		this.daper = daper;
	}
	
/*To string method*/
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", employeename=" + employeename + ", salary=" + salary
				+ ", hraper=" + hraper + ", daper=" + daper + "]";
	}

/*Getter and setter*/
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getHraper() {
		return hraper;
	}

	public void setHraper(double hraper) {
		this.hraper = hraper;
	}

	public double getDaper() {
		return daper;
	}

	public void setDaper(double daper) {
		this.daper = daper;
	}
	
	/*calculating gross salary and passing gross salary to tax util class*/
	public double calculategrosssalary()
	{
		return salary+hraper+daper;
	}
}
