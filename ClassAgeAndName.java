package com.corejava;

public class ClassAgeAndName {
	private String name;
    private int age;
    public ClassAgeAndName(String name, int age) {
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
	ClassAgeAndName person1 = new ClassAgeAndName("Mahesh", 11);
	ClassAgeAndName person2 = new ClassAgeAndName("Bhushan", 12);
    System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
    System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
  }
	
	
}
