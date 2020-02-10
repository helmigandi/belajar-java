//Java program to illustrate error while 
//using class from different package with 
//default modifier 
package p2; 
import p1.*; 

//This class is having default access modifier 
class Class1Main 
{ 
	public static void main(String args[]) 
	{ 
		//accessing class Geek from package p1 
		Class1 obj = new Class1(); 

		obj.display(); 
	} 
} 

