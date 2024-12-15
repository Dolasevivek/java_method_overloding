package com.mcq;

public class Taxcalxulation {

	public static void main(String[] args) {
	/* here we created object of All Blc Classes to pass the value via parameterized constructor */
	    Employee e=new Employee(101, "Akash", 50000, 2000, 1000);
		Manager m=new Manager(102, "Manoj", 40000, 2000, 1000, 500);
		Trainer t=new Trainer(103, "Ankush", 60000, 5000, 1200, 670, 120);
		Sourcing s=new Sourcing(104, "manish", 70000, 4000, 2000, 1000, 500, 120);
		
	/* here we created Taxutil class  object to call Tax calculating methods*/	
		  Taxutil tu=new Taxutil();
	      System.out.println(e);                               /*Here we calling tostring method */
	      System.out.println( "Total tax =  "+tu.calculatetax(e));             /*called tax calculating method and printed tax*/
	      System.out.println(m);
	      System.out.println( "Totaltax =  "+tu.calculatetax(m));
	      System.out.println(t);
	      System.out.println( "Totaltax =  "+ tu.calculatetax(t));
	      System.out.println(s);
	      System.out.println( "Totaltax =  "+tu.calculatetax(s));
	}

}
