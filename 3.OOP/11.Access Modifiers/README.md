# Access Modifiers in Java
Digunakan untuk membatasi  jangkauan dari class, constructor, variable, method dan data member. 
Class dalam program Java dapat saling berhubungan dengan cara memberikan akses terhadap member mereka. Semua yang ada di dalam _class_ (atribut dan _method_) disebut member. 
| Modifier	| Class | Package | Subclass | World |
|-----------|-------|---------|----------|-------|
| Public    | Yes | Yes | Yes | Yes |
| Protected | Yes | Yes | Yes | No |
| Default   | Yes | Yes | No | No |
| Private   | Yes | No | No | No |
Keterangan:
- Yes: Bisa diakses
- No: Tidak bisa diakses
- Subclass: Class anak
- World: Seluruh package di aplikasi

Berikut adalah penjelasan lebih terperinci tentang masing-masing akses:
1. Default
	- Jika kita tidak memberikan akses pada class, method atau data member, maka Java akan memberikan akses **default**. 
	- Hanya akan bisa diakses dari Class itu sendiri dan package (class yang berada satu package dengannya).

	Contohnya, kita membuat dua package `p1` dan `p2`. Kita akan mencoba akses dengan default modifiers.
	- Buat folder src, di dalam folder src terdapat folder p1 dan p2 (Contohnya pada Github).
	- Membuat Class1.java pada folder p1:
		```java
		//Java program to illustrate default modifier 
		package p1; 

		//Class Class1 is having Default access modifier 
		class Class1 
		{ 
			void display() 
			{ 
				System.out.println("Hello World!"); 
			} 
		} 
		```
	- Membuat Class1Main.java pada folder p2:
		```java
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
				//accessing class Class1 from package p1 
					Class1 obj = new Class1(); 
					obj.display(); 
			} 
		} 
		```
	- Mengakses dari folder src, ketik pada terminal:
	`javac p2/Class1Main.java`
	- Muncul pesan error:
	` error: Class1 is not public in p1; cannot be accessed from outside package`

2. Private
Modifier `private` akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
Perlu diingat:
	- Modifier `private` tidak bisa diberikan kepada class, enum, dan interface. 
	- Modifier `private` hanya bisa diberikan kepada member class.
	```java
	//Java program to illustrate error while 
	//using class from different package with 
	//private modifier 
	package p1; 

	class A { 
		private void display() 
		{ 
			System.out.println("Hello Access Modifier"); 
		} 
	} 

	class B { 
		public static void main(String args[]) 
			{ 
				A obj = new A(); 
				//trying to access private method of another class 
				obj.display(); 
			} 
	} 
	// Output:
	// error: display() has private access in A obj.display();
	```
	Untuk mengakses member `private` dari luar class? Kita bisa memanfaatkan method setter dan getter.

3. Protected
Modifier `protected` akan membuat member dan class hanya bisa diakses dari:
	- Class itu sendiri;
	- Sub class atau class anak;
	- Package (class yang berada satu package dengannya).

	Contoh sama seperti pada default hanya saja diganti `protected`:
	```java
	//Java program to illustrate 
	//protected modifier 
	package p1; 

	//Class A 
	public class A { 
		protected void display() { 
			System.out.println("Hello Protected"); 
		} 
	} 
	```
	
	```java
	//Java program to illustrate 
	//protected modifier 
	package p2; 
	import p1.*; //importing all classes in package p1 

	//Class B is subclass of A 
	class B extends A { 
		public static void main(String args[]) { 
			B obj = new B(); 
			obj.display(); 
		} 
	} 
	```
	Output:
	`Hello Protected`

4. Public
Modifier `public` akan membuat member dan class bisa di akses dari mana saja. Contoh sama seperti default hanya diganti public pada bagian access modifier.

Sumber:
- [https://www.petanikode.com/java-oop-modifier/](https://www.petanikode.com/java-oop-modifier/)
- [https://www.geeksforgeeks.org/access-modifiers-java/](https://www.geeksforgeeks.org/access-modifiers-java/)
- [https://www.w3schools.com/JAVA/java_modifiers.asp](https://www.w3schools.com/JAVA/java_modifiers.asp)
