package com.mcq;

public class Sourcing {
/*instance variables*/
	
private int sourceid;
private String sourcename;
private double basicsalary;
private double haper;
private double daper;
private double enrollmenttarget;
private int enrollmentreached;
private double perkperenrollment;

/*parameterized constructor*/
public Sourcing(int sourceid, String sourcename, double basicsalary, double haper, double daper,
		double enrollmenttarget, int enrollmentreached, double perkperenrollment) {
	super();
	this.sourceid = sourceid;
	this.sourcename = sourcename;
	this.basicsalary = basicsalary;
	this.haper = haper;
	this.daper = daper;
	this.enrollmenttarget = enrollmenttarget;
	this.enrollmentreached = enrollmentreached;
	this.perkperenrollment = perkperenrollment;
}

/* using to string Method printing object proiperties/instance variables*/
@Override
public String toString() {
	return "Sourcing [sourceid=" + sourceid + ", sourcename=" + sourcename + ", basicsalary=" + basicsalary + ", haper="
			+ haper + ", daper=" + daper + ", enrollmenttarget=" + enrollmenttarget + ", enrollmentreached="
			+ enrollmentreached + ", perkperenrollment=" + perkperenrollment + "]";
}

/* Getter and setter to set and get values*/
public int getSourceid() {
	return sourceid;
}
public void setSourceid(int sourceid) {
	this.sourceid = sourceid;
}
public String getSourcename() {
	return sourcename;
}
public void setSourcename(String sourcename) {
	this.sourcename = sourcename;
}
public double getBasicsalary() {
	return basicsalary;
}
public void setBasicsalary(double basicsalary) {
	this.basicsalary = basicsalary;
}
public double getHaper() {
	return haper;
}
public void setHaper(double haper) {
	this.haper = haper;
}
public double getDaper() {
	return daper;
}
public void setDaper(double daper) {
	this.daper = daper;
}
public double getEnrollmenttarget() {
	return enrollmenttarget;
}
public void setEnrollmenttarget(double enrollmenttarget) {
	this.enrollmenttarget = enrollmenttarget;
}
public int getEnrollmentreached() {
	return enrollmentreached;
}
public void setEnrollmentreached(int enrollmentreached) {
	this.enrollmentreached = enrollmentreached;
}
public double getPerkperenrollment() {
	return perkperenrollment;
}
public void setPerkperenrollment(double perkperenrollment) {
	this.perkperenrollment = perkperenrollment;
}
/*calculating gross salary and passing gross salary to tax util class*/
public double calculategrosssalary()
{
	
	return basicsalary +haper +daper +(((enrollmentreached/enrollmenttarget)*100)*perkperenrollment);
}
}
