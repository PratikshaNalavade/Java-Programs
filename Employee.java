package com.encapsulationex;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	public int getId(int a)
	{
		this.empId=a;
		return empId;
	}
	
	public String getName(String name)
	{
		this.empName=name;
		return empName;
	}
	 public double getSalary(double salary)
	 {
		 this.salary=salary;
		 return salary;
	 }
	 
	 public void setSalary(double amount)
	 {
		 this.salary=amount;
		 if(amount<0)
		 {
			 System.out.println("Salary cannot be negative value");
		 }
	 }
	 
	 public void empInfo()
	 {
		 System.out.println(this.empId+ " "+ this.empName +" "+this.salary);
	 }
}
