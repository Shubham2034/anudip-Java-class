package com.corejava;

public class PersonObject {
	 private String name;
	    private int age;
	    public PersonObject(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }

	public static void main(String[] args) {
		PersonObject person1 = new PersonObject("Mahesh", 22);
		PersonObject person2 = new PersonObject("Bhushan", 23);
	    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
	    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
	

		    

		
	}

}
