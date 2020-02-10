# Method Overloading
Kita dapat membuat method dengan nama yang sama tetapi berbeda parameter. Keuntungannya adalah kita tidak perlu membuat nama method yang berbeda untuk melakukan hal yang sama. Jika tidak ada Overloading maka kita harus membuat nama method seperti: sum1, sum2, … or sum2Int, sum3Int, … etc. Contoh:
```java
// Java program to demonstrate working of method 
// overloading in Java. 

public class Sum { 

	// Overloaded sum(). This sum takes two int parameters 
	public int sum(int x, int y) 
	{ 
		return (x + y); 
	} 

	// Overloaded sum(). This sum takes three int parameters 
	public int sum(int x, int y, int z) 
	{ 
		return (x + y + z); 
	} 

	// Overloaded sum(). This sum takes two double parameters 
	public double sum(double x, double y) 
	{ 
		return (x + y); 
	} 

	// Driver code 
	public static void main(String args[]) 
	{ 
		Sum s = new Sum(); 
		System.out.println(s.sum(10, 20)); 
		System.out.println(s.sum(10, 20, 30)); 
		System.out.println(s.sum(10.5, 20.5)); 
	} 
} 
/* Output :

30
60
31.0
*/
```
However, Overloading methods akan mengembalikan tipe data nilai sama degan tipe data pada method di deklarasikan. Contoh:
```java
// Java program to demonstrate the working of method 
// overloading in static methods 
public class Main { 

	public static int foo(int a) { return 10; } 
	public static char foo(int a, int b) { return 'a'; } 

	public static void main(String args[]) 
	{ 
		System.out.println(foo(1)); 
		System.out.println(foo(1, 2)); 
	} 
} 
/* Output
10
a
*/
```
```java
// Java program to demonstrate working of method 
// overloading in methods 
class A { 
	public int foo(int a) { return 10; } 

	public char foo(int a, int b) { return 'a'; } 
} 

public class Main { 

	public static void main(String args[]) 
	{ 
		A a = new A(); 
		System.out.println(a.foo(1)); 
		System.out.println(a.foo(1, 2)); 
	} 
} 
/* Output:

10
a
*/
```
```java
// A Java program with overloaded main() 
import java.io.*; 

public class Test { 

	// Normal main() 
	public static void main(String[] args) 
	{ 
		System.out.println("Hi Geek (from main)"); 
		Test.main("Geek"); 
	} 

	// Overloaded main methods 
	public static void main(String arg1) 
	{ 
		System.out.println("Hi, " + arg1); 
		Test.main("Dear Geek", "My Geek"); 
	} 
	public static void main(String arg1, String arg2) 
	{ 
		System.out.println("Hi, " + arg1 + ", " + arg2); 
	} 
} 
/* Output
Hi Geek (from main)
Hi, Geek
Hi, Dear Geek, My Geek
```

**Sumber:**
- [https://www.geeksforgeeks.org/overloading-in-java/](https://www.geeksforgeeks.org/overloading-in-java/)
