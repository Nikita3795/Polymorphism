package com.sep4;
// Method overloading by changing no. of argumenmts
public class Area {

		 void find (int l, int b) {
			 System.out.println("Area is " + (l * b)); 
			 }

		void find(int l, int b, int h) { 
			System.out.println("Area is " + (l* b* h));

		}

		public static void main(String[] args) {

		Area ar = new Area(); 
		ar.find(8, 5); 
		// find(int 1, int b) is method is called.

		ar.find(4, 6, 2); 
		// find(int I, int b,int h) is called.

		}

		
	
}
