package com.corejava;
class Employee1
{
	public int salary;
	
	public Employee1(int sal)
	{
		salary=sal;
	}
	public void work () 
	{
	System.out.println("working as a employee");
	
}
	public int getSalary()
	{
		return salary;
	}
	}
 class Manager extends Employee1
 {

	public Manager(int sal) {
		
		super(sal);
		
	}
	public void work()
	
	{
		System.out.println("Managing the employee");
	}
	 public void addEmployee()
	 {
		 System.out.println("Adding the  employee");
		
		 
	 }
 }
public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee1 emp=new Employee1(40000);
		Manager mar=new Manager(70000);
		
		emp.work();
		System.out.println("Employeeb salary" +emp.getSalary());
		
		mar.work();
		System.out.println("Manager salary "+emp.getSalary());
		

	}
	
	
}



