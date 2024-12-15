package com.mcq;

public class Manager {
/* instance variables*/
	private int managerid;
	private String managername;
	private double basicsalary;
	private double hraper;
	private double daper;
	private double projectallowance;
	
	/*parameterized constructor*/
	public Manager(int managerid, String managername, double basicsalary, double hraper, double daper,
			double projectallowance) {
		super();
		this.managerid = managerid;
		this.managername = managername;
		this.basicsalary = basicsalary;
		this.hraper = hraper;
		this.daper = daper;
		this.projectallowance = projectallowance;
	}
	
	/*To string method*/
	@Override
	public String toString() {
		return "Manager [managerid=" + managerid + ", managername=" + managername + ", basicsalary=" + basicsalary
				+ ", hraper=" + hraper + ", daper=" + daper + ", projectallowance=" + projectallowance + "]";
	}
   /*Getter and setter method to get and set values*/

	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
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
	public double getProjectallowance() {
		return projectallowance;
	}
	public void setProjectallowance(double projectallowance) {
		this.projectallowance = projectallowance;
	}
	/*calculating gross salary and passing gross salary to tax util class*/
	public double calculetegrosssalary()
	{
		return  basicsalary+hraper+daper+projectallowance;
	}
	
	
}
