Data Types
=========
Data types digunakan untuk menentukan jumlah alokasi memori yang bisa ditampung. Oleh karena itu, jumlah alokasi memori setiap variable berbeda-beda.

Primitive Data Types
-------------------------
Primitive data types menyimpan nilai ke dalam memori secara langsung. Primitive data terdiri dari: `byte`, `short`, `int`, `long`, `float`, `double`, `boolean` dan `char`. Contoh: 

gambar

Pada gambar di atas kita mendeklarasikan variable i sebagai int dengan nilai 15 dan C sebagai char dengan nilai a. Kita dapat membayangkan variable tersebut disimpan ke dalam memori dengan melihat gambar kotak-kotak di sebelah kode. Salah satu kotak tersebut bernama i di dalamnya memiliki nilai 15 sebagai nilai dan kotak lain bernama C di dalamnya terdapat karakter a. Setiap kotak terdapat alamat (address) 300 untuk variable i dan 604 untuk variable a yang ditetapkan memori.

Java Type Casting
----------------------
Diugunakan untuk mengkonversi tipe data primitive. Di java terdapat dua jenis konversi:
- Widening Casting (automatically): 	Konversi tipe data dari kecil ke besar.
`byte` -> `short` -> `char` -> `int` -> `long` -> `float` -> `double`
	```java
	public class MyClass {
	  public static void main(String[] args) {
	    int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double
	
	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	  }
	}
	```

- Narrowing Casting (manually): Konversi tipe data dari besar ke kecil. 
`double` -> `float` -> `long` -> `int` -> `char` -> `short` -> `byte`
	```java
	public class MyClass {
	  public static void main(String[] args) {
	    double myDouble = 9.78;
	    int myInt = (int) myDouble; // Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	  }
	}
	```

Non-Primitive Data Types (reference types)
----------------------------------------------------
Neso Academy video







Penggunaan dan Perbedaan Primitive and Non-Primitive
-------------------------------------------------------------
- Tipe data primitive selalu memiliki nilai, sedangkan tipe data non-primitive bisa tidak memiliki nilai atau  `null`.
- Tipe data primitive menggunakan huruf kecil diawal kata, sedangkan tipe data non-primitive menggunakan huruf besar di awal kata.
- Tipe data non-primitive digunanakan pada Collection dan kompleks data sturktur.
- Java adalah OOP jadi semua yang ada di Java bersifat Object kecuali tipe data primitive. Sebagai solusi Java dapat memasukan tipe data primitive sebagai ke dalam keluarga object dengan menggunakan wrapper class.
- Penggunaan data primitive jauh lebih cepat dari sisi performa.
- Hindari penggunaan perbandingan `==` atau `!=` karena Java akan mendeteksi dua objek yang berbeda walaupun nilainya sama.
	```java
	public class IntTest{
	public static void compare(){
		int i = 1000;
		Integer j = 1000;
		Integer k = 1000;

		if(i == j)System.out.println("int == Integer");
		else System.out.println("int != Integer");
		// int == Integer

		if(k == j)System.out.println("Integer == Integer");
		else System.out.println("Integer != Integer");
		// Integer != Integer
	}

	public static void main (String[] args){
		compare();
		}
	}
	```
Java Wrapper Class
-----------------------
adalah class yang membungkus tipe data primitive dalam suatu objek. Jenis Wrapper class termasuk ke dalam package java.lang:
- Double
- Float
- Long
- Integer
- Short
- Byte
- Character
- Boolean

Saat kita bekerja dengan object, kita dapat menggunakan *method* tertentu dari masing-masing object. Contoh *method* jika kita ingin mendapatkan nilai dari wrapper class tertentu: `intValue()`, `byteValue()`, `shortValue()`, `longValue()`, `floatValue()`, `doubleValue()`, `charValue()`, `booleanValue()`.

Berikut adalah contoh ouputnya:
```java
public class MyClass {
  public static void main(String[] args) {
    Integer myInt = 5;
    Double myDouble = 5.99;
    Character myChar = 'A';
    System.out.println(myInt.intValue());
    System.out.println(myDouble.doubleValue());
    System.out.println(myChar.charValue());
  }
}
```
Salah satu *method* penting yang dapat digunakan adalah `toString()`, yang digunakan untuk konversi wrapper class ke String.

Berikut adalah contoh untuk konversi `Integer` ke `String`, dan menggunakan method `length()` dari `String` class untuk menampilkan panjang "string":
```java
public class MyClass {
  public static void main(String[] args) {
    Integer myInt = 100;
    String myString = myInt.toString();
    System.out.println(myString.length());
  }
}
```

Need of Wrapper Class
----------------------------
1. Digunakan untuk konversi tipe data primitive ke object. Object dibutuhkan jika kita ingin ke argumen yang diteruskan ke suatu method (Karena tipe data primitive meneruskan atau mengirimkan nilai (passed by value)).
2. Penggunaan Data Structures di dalam Collection Framework seperti ArrayList and Vector hanya menggunakan Object(reference type).
3. Penggunaan Generics hanya bekerja pada Object.
4. Jika terdapat `null`.

Autoboxing
--------------
Konversi otomatis dari tipe data primitives ke object wrapper class.
```java
Character ch ='a';//char to Character
List<Integer> integerList = new ArrayList<>();
for(int i =1; i <10; i ++)
	{
	integerList.add(i);	//int to Integer
	//integerList.add(Integer.valueOf(i)); //bisa juga
	}
// printing the values from object
System.out.println(arrayList.get(0));
```

Unboxing
-----------
Konversi otomatis dari wrapper class ke tipe data primitive.
```java
import java.util.ArrayList;
class Unboxing{
public static void main(String[] args)
{
	Character ch ='a';
	// unboxing - Character object to primitive conversion
	char a = ch;

	ArrayList<Integer> arrayList = new ArrayList<Integer>();
	arrayList.add(24);

	// unboxing because get method returns an Integer object
	int num = arrayList.get(0);

	// printing the values from primitive data types
	System.out.println(num);
	}
}
```

**Sumber:**
- [https://www.w3schools.com](https://www.w3schools.com/JAVA/java_type_casting.asp)
- [https://howtodoinjava.com](https://howtodoinjava.com/java/basics/data-types-in-java/)
- [https://stackoverflow.com](https://stackoverflow.com/questions/3579035/why-are-there-wrapper-classes-in-java)
- [https://stackoverflow.com](https://stackoverflow.com/questions/10623682/using-int-vs-integer)
- [https://www.youtube.com](https://www.youtube.com/watch?v=9emGWl35HHU)
- [https://www.youtube.com](https://www.youtube.com/watch?v=UHtJhQwQ6io)
- [https://www.w3schools.com](https://www.w3schools.com/JAVA/java_wrapper_classes.asp)
- [https://howtodoinjava.com](https://howtodoinjava.com/java/basics/java-wrapper-classes/)
- [https://www.geeksforgeeks.org](https://www.geeksforgeeks.org/wrapper-classes-java/)
