# Constructor
Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek _(instance)_. Biasanya method ini digunakan untuk inisialisasi atau mempersiapkan data untuk objek.

Constructor dipanggil setiap membuat objek menggunakan **new()** keyword untuk menetapkan nilai awal ke **data members** pada class. 

Nama Constructor harus sama dengan nama class. Secara _default_ di Java constuktor akan dibuatkan otomatis ketika kita tidak mendefinisikan construktor di _class_ yang kita buat.
```
class TestConstructor
{   
  .......
  
  // A Constructor
  new TestConstructor() {}

  .......
}

// We can create an object of the above class
// using the below statement. This statement
// calls above constructor.
TestConstructor obj = new TestConstructor();
```
Contoh:
```java
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}

// Outputs 1969 Mustang
```
Contoh 2:
```java
// Java Program to illustrate calling of 
// parameterized constructor. 
import java.io.*; 

class Geek 
{ 
	// data members of the class. 
	String name; 
	int id; 

	// constructor would initialize data members 
	// with the values of passed arguments while 
	// object of that class created. 
	Geek(String name, int id) 
	{ 
		this.name = name; 
		this.id = id; 
	} 
} 

class GFG 
{ 
	public static void main (String[] args) 
	{ 
		// this would invoke the parameterized constructor. 
		Geek geek1 = new Geek("adam", 1); 
		System.out.println("GeekName :" + geek1.name + 
						" and GeekId :" + geek1.id); 
	} 
} 
```
Contoh Constructor Overloading:
```java
// Java Program to illustrate constructor overloading 
// using same task (addition operation ) for different 
// types of arguments. 
import java.io.*; 

class Geek 
{ 
	// constructor with one argument 
	Geek(String name) 
	{ 
		System.out.println("Constructor with one " + 
					"argument - String : " + name); 
	} 

	// constructor with two arguments 
	Geek(String name, int age) 
	{ 

		System.out.println("Constructor with two arguments : " + 
				" String and Integer : " + name + " "+ age); 

	} 

	// Constructor with one argument but with different 
	// type than previous.. 
	Geek(long id) 
	{ 
		System.out.println("Constructor with one argument : " + 
											"Long : " + id); 
	} 
} 

class GFG 
{ 
	public static void main(String[] args) 
	{ 
		// Creating the objects of the class named 'Geek' 
		// by passing different arguments 

		// Invoke the constructor with one argument of 
		// type 'String'. 
		Geek geek2 = new Geek("Shikhar"); 

		// Invoke the constructor with two arguments 
		Geek geek3 = new Geek("Dharmesh", 26); 

		// Invoke the constructor with one argument of 
		// type 'Long'. 
		Geek geek4 = new Geek(325614567); 
	} 
} 
```
```java
public class MyClass {

    private int number = 0;

    public MyClass() {
    }

    public MyClass(int theNumber) {
        this.number = theNumber;
    }
}
```
**Sumber:**
- [https://www.petanikode.com/java-oop-constructor/](https://www.petanikode.com/java-oop-constructor/)
- [https://www.w3schools.com/JAVA/java_constructors.asp](https://www.w3schools.com/JAVA/java_constructors.asp)
- [https://www.dimas-maryanto.com/bootcamp/java/core/033-contructor-java](https://www.dimas-maryanto.com/bootcamp/java/core/033-contructor-java)
- [https://www.geeksforgeeks.org/constructors-in-java/](https://www.geeksforgeeks.org/constructors-in-java/)
