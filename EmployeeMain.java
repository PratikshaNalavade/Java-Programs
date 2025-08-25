package com.encapsulationex;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.getId(101);
		e1.getName("Pratiksha");
		
		System.out.println(e1.getSalary(30000));
		e1.empInfo();
		e1.setSalary(-35000);   //Updated salary
		
		

	}

}
