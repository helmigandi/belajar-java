# This and Super
## This
Kata kunci `this` digunakan sebagai referensi dari object class itu sendiri atau secara singkatnya `this` artinya class itu sendiri.
Contoh `this` mengacu pada variable object class:
```java
//Java code for using 'this' keyword to 
//refer current class instance variables 
class Test 
{ 
	int a; 
	int b; 
	
	// Parameterized constructor 
	Test(int a, int b) 
	{ 
		this.a = a; 
		this.b = b; 
	} 

	void display() 
	{ 
		//Displaying value of variables a and b 
		System.out.println("a = " + a + " b = " + b); 
	} 

	public static void main(String[] args) 
	{ 
		Test object = new Test(10, 20); 
		object.display(); 
	} 
} 
// Output:  
// a = 10  b = 20
```

## Super
Jika `this` merepresentasikan objek dari class itu sendiri, maka `super` akan merepresentasikan objek dari class induk.
Contoh `super` dengan variable:
```java
/* Base class vehicle */
class Vehicle 
{ 
	int maxSpeed = 120; 
} 

/* sub class Car extending vehicle */
class Car extends Vehicle 
{ 
	int maxSpeed = 180; 

	void display() 
	{ 
		/* print maxSpeed of base class (vehicle) */
		System.out.println("Maximum Speed: " + super.maxSpeed); 
	} 
} 

/* Driver program to test */
class Test 
{ 
	public static void main(String[] args) 
	{ 
		Car small = new Car(); 
		small.display(); 
	} 
} 
// output
// Maximum Speed: 120
```
Contoh `this` dengan Method:
```java
/* Base class Person */
class Person 
{ 
	void message() 
	{ 
		System.out.println("This is person class"); 
	} 
} 

/* Subclass Student */
class Student extends Person 
{ 
	void message() 
	{ 
		System.out.println("This is student class"); 
	} 

	// Note that display() is only in Student class 
	void display() 
	{ 
		// will invoke or call current class message() method 
		message(); 

		// will invoke or call parent class message() method 
		super.message(); 
	} 
} 

/* Driver program to test */
class Test 
{ 
	public static void main(String args[]) 
	{ 
		Student s = new Student(); 

		// calling display() of Student 
		s.display(); 
	} 
} 
// Output:
// This is student class
// This is person class
```

Sumber:
- [https://www.geeksforgeeks.org/this-reference-in-java/](https://www.geeksforgeeks.org/this-reference-in-java/)
- [https://www.petanikode.com/java-oop-this-super/](https://www.petanikode.com/java-oop-this-super/)
- [https://www.dimas-maryanto.com/bootcamp/java/core/032-keyword-super-this](https://www.dimas-maryanto.com/bootcamp/java/core/032-keyword-super-this)
- [https://www.geeksforgeeks.org/super-keyword/](https://www.geeksforgeeks.org/super-keyword/)
