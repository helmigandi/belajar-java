# Inheritance
_Inheritance_ atau  pewarisan adalah hubungan antara kode seperti hubungan keluarga antara orang tua dan anak. Sebuah class di Java, bisa memiliki satu atau lebih keturunan atau class anak. Class anak akan memiliki warisan properti dan method dari class ibu. Biasanya kita menggunakan kata kunci `extends` untuk menyatakan kalau dia adalah class turunan.
Catatan:
-   Super Class: Class yang mewarisi fitur dapat disebut super class atau base class atau parent class.
-   Sub Class: Class yang diwarisi oleh class lain dapat disebut sub class atau derived class atau extended class atau child class.
- Reusability: Digunakan untuk penggunaan kembali kode, jika suatu kelas memiliki method yang sama dengan kelas lain, namun memiliki kode yang berbeda. Contoh class `Vehicle`, yang memiliki sub class `Car` dan `Truck`.

Pada Java `protected` dan  `public` fields dan methods yang dapat diwarisi dari superclass ke subclass. Diwarisi berarti fields dan methods adalah bagian dari subclass. 

Contoh:
```java
//Java program to illustrate the 
// concept of inheritance 

// base class 
class Bicycle 
{ 
	// the Bicycle class has two fields 
	public int gear; 
	public int speed; 
		
	// the Bicycle class has one constructor 
	public Bicycle(int gear, int speed) 
	{ 
		this.gear = gear; 
		this.speed = speed; 
	} 
		
	// the Bicycle class has three methods 
	public void applyBrake(int decrement) 
	{ 
		speed -= decrement; 
	} 
		
	public void speedUp(int increment) 
	{ 
		speed += increment; 
	} 
	
	// toString() method to print info of Bicycle 
	public String toString() 
	{ 
		return("No of gears are "+gear 
				+"\n"
				+ "speed of bicycle is "+speed); 
	} 
} 

// derived class 
class MountainBike extends Bicycle 
{ 
	
	// the MountainBike subclass adds one more field 
	public int seatHeight; 

	// the MountainBike subclass has one constructor 
	public MountainBike(int gear,int speed, 
						int startHeight) 
	{ 
		// invoking base-class(Bicycle) constructor 
		super(gear, speed); 
		seatHeight = startHeight; 
	} 
		
	// the MountainBike subclass adds one more method 
	public void setHeight(int newValue) 
	{ 
		seatHeight = newValue; 
	} 
	
	// overriding toString() method 
	// of Bicycle to print more info 
	@Override
	public String toString() 
	{ 
		return (super.toString()+ 
				"\nseat height is "+seatHeight); 
	} 
	
} 

// driver class 
public class Test 
{ 
	public static void main(String args[]) 
	{ 
		
		MountainBike mb = new MountainBike(3, 100, 25); 
		System.out.println(mb.toString()); 
			
	} 
} 
```

Sumber:
- [https://www.geeksforgeeks.org/inheritance-in-java/](https://www.geeksforgeeks.org/inheritance-in-java/)
- [https://www.w3schools.com/JAVA/java_inheritance.asp](https://www.w3schools.com/JAVA/java_inheritance.asp)
- [https://www.petanikode.com/java-oop-inheritance/](https://www.petanikode.com/java-oop-inheritance/)
- [http://tutorials.jenkov.com/java/inheritance.html](http://tutorials.jenkov.com/java/inheritance.html)
- [https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/](https://www.geeksforgeeks.org/referencing-subclass-objects-subclass-vs-superclass-reference/)
