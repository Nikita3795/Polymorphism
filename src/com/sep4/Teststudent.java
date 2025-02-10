package com.sep4;

public class Teststudent {
	 public static void main(String[] args) {

			Student s1 = new Student();

			s1.setData("Ankita", 20);

			Student s2 = new Student();

			s2.setData("Nikita", 25, "Nikita@candidjava.com");
		}


//public class Baseclass{
	public void method() { // Base class method
		System.out.println("I'm the mehtod of Baseclass");
		
	}
}