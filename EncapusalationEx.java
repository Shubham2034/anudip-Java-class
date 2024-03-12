package com.corejava;



class Student //-single unit
{
	 int id;
	 String name;
	 String address;
	 String email;
	 
	 void display()
	 {
		 System.out.println(id+""+ name +""+address+""+email);
	 }
	 
	
}
public class EncapusalationEx {

	public static void main(String[] args) {
	Student st1=new Student();
	st1.id=1;
	st1.name="Shubham";
	st1.address="Pune";
	st1.email="sh@gmail.com";
	
	
	
	

	}

}
