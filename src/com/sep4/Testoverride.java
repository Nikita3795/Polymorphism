package com.sep4;

public class Testoverride {

	public static void main(String[] args) {

		 // method calling from sub class object 
		Derivedclass der = new Derivedclass(); 
		der.method();
		// method calling from super class object
		Baseclass base = new Baseclass(); base.method();

		Baseclass basel = new Derivedclass(); 
		basel.method();
}
}