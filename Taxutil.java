package com.mcq;

public class Taxutil {

	public double calculatetax(Employee e) //passing calss name pas parameter
	{
		if(e.calculategrosssalary()>50000) // using class name and object we are getting gross salary and calculating tax
		{
			return e.calculategrosssalary()*0.20;
		}
		else
		{
			return e.calculategrosssalary()*0.05;
		}
	}
	
	public double calculatetax(Manager m)//passing calss name pas parameter
	{
		if(m.calculetegrosssalary()>50000)// using class name and object we are getting gross salary and calculating tax
		{
			return m.calculetegrosssalary()*0.2;
		}
		else
		{
			return m.calculetegrosssalary()*0.05;
		}
	}
	
	public double calculatetax(Trainer t)//passing calss name pas parameter
	{
		if(t.calculategrosssalary()>50000)// using class name and object we are getting gross salary and calculating tax
		{
			return t.calculategrosssalary()*0.2;
		}
		else
		{
			return t.calculategrosssalary()*0.05;
		}
	}
	
	public double calculatetax(Sourcing s)//passing calss name pas parameter
	{
		if(s.calculategrosssalary()>50000)// using class name and object we are getting gross salary and calculating tax
		{
			return s.calculategrosssalary()*0.2;
		}
		else
		{
			return s.calculategrosssalary()*0.05;
		}
	}
}
