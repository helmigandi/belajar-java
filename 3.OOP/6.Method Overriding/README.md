# Method Overriding
Method Overriding (redefine)digunakan saat kita ingin membuat ulang sebuah method pada sub-class atau class anak. Method Overriding dapat dibuat dengan menambahkan anotasi `@Override` di atas nama method atau sebelum pembuatan method.

```java
// A Simple Java program to demonstrate 
// method overriding in java 

// Base Class 
class Parent { 
	void show() 
	{ 
		System.out.println("Parent's show()"); 
	} 
} 

// Inherited class 
class Child extends Parent { 
	// This method overrides show() of Parent 
	@Override
	void show() 
	{ 
		System.out.println("Child's show()"); 
	} 
} 

// Driver class 
class Main { 
	public static void main(String[] args) 
	{ 
		// If a Parent type reference refers 
		// to a Parent object, then Parent's 
		// show is called 
		Parent obj1 = new Parent(); 
		obj1.show(); 

		// If a Parent type reference refers 
		// to a Child object Child's show() 
		// is called. This is called RUN TIME 
		// POLYMORPHISM. 
		Parent obj2 = new Child(); 
		// Secara singkat, mengambil nilai dari kelas child
		obj2.show(); 
	} 
} 
```
```java
// A Simple Java program to demonstrate 
// Overriding and Access-Modifiers 

class Parent { 
	// private methods are not overridden 
	private void m1() 
	{ 
		System.out.println("From parent m1()"); 
	} 

	protected void m2() 
	{ 
		System.out.println("From parent m2()"); 
	} 
} 

class Child extends Parent { 
	// new m1() method 
	// unique to Child class 
	private void m1() 
	{ 
		System.out.println("From child m1()"); 
	} 

	// overriding method 
	// with more accessibility 
	@Override
	public void m2() 
	{ 
		System.out.println("From child m2()"); 
	} 
} 

// Driver class 
class Main { 
	public static void main(String[] args) 
	{ 
		Parent obj1 = new Parent(); 
		obj1.m2(); 
		Parent obj2 = new Child(); 
		obj2.m2(); 
	} 
} 
```
Sumber:
- [https://www.geeksforgeeks.org/overriding-in-java/](https://www.geeksforgeeks.org/overriding-in-java/)
- [https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/](https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/)
- [https://www.petanikode.com/java-oop-inheritance/](https://www.petanikode.com/java-oop-inheritance/)
- [https://www.dimas-maryanto.com/bootcamp/java/core/031-polymorpism-java](https://www.dimas-maryanto.com/bootcamp/java/core/031-polymorpism-java)
