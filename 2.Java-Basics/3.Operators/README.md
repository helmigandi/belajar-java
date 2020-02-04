# Java Operators

## Arithmatic Operator
Digunakan untuk melakukan operasi aritmatika sederhana pada data primitive. Berikut adalah Operator pada Java berdasarkan fungsinya:
- `*` : Multiplication
- `/` : Division
- `%` : Modulus
- `+` : Addition
- `-` : Subtraction
```java
// Java program to illustrate 
// arithmetic operators 
public class operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		String x = "Thank", y = "You"; 

		// + and - operator 
		System.out.println("a + b = " + (a + b)); 
		System.out.println("a - b = " + (a - b)); 

		// + operator if used with strings 
		// concatenates the given strings. 
		System.out.println("x + y = " + x + y); 

		// * and / operator 
		System.out.println("a * b = " + (a * b)); 
		System.out.println("a / b = " + (a / b)); 

		// modulo operator gives remainder 
		// on dividing first operand with second 
		System.out.println("a % b = " + (a % b)); 

		// if denominator is 0 in division 
		// then Arithmetic exception is thrown. 
		// uncommenting below line would throw 
		// an exception 
		// System.out.println(a/c); 
		System.out.println("++a = " + (++a));
       	System.out.println("a++ = " + (a++));
       	System.out.println("a = " + (a));
	} 
} 
```
## Unary Operators
Digunakan untuk menambah atau mengurang nilai dari variable sebanyak satu kali.
```java
// Java program to illustrate 
// unary operators 
public class operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30; 
		boolean condition = true; 

		// pre-increment operator 
		// a = a+1 and then c = a; 
		c = ++a; 
		System.out.println("Value of c (++a) = " + c); 

		// post increment operator 
		// c=b then b=b+1 
		c = b++; 
		System.out.println("Value of c (b++) = " + c); 

		// pre-decrement operator 
		// d=d-1 then c=d 
		c = --d; 
		System.out.println("Value of c (--d) = " + c); 

		// post-decrement operator 
		// c=e then e=e-1 
		c = e--; 
		System.out.println("Value of c (e--) = " + c); 

		// Logical not operator 
		System.out.println("Value of !condition ="
						+ !condition); 
	} 
} 
```
## Assign Operator
Digunakan untuk menetapkan nilai ke variable.
```java
// Java program to illustrate 
// assignment operators 
public class operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c, d, e = 10, f = 4, g = 9, h = 10; 

		// simple assignment operator 
		c = b; 
		System.out.println("Value of c = " + c); 

		// This following statement would throw an exception 
		// as value of right operand must be initialised 
		// before assignment, and the program would not 
		// compile. 
		// c = d; 

		// instead of below statements, shorthand 
		// assignment operators can be used to 
		// provide same functionality. 
		a = a + 1; 
		b = b - 1; 
		e = e * 2; 
		f = f / 2; 
		System.out.println("a, b, e, f = " + a + ", "
						+ b + ", " + e + ", " + f); 
		a = a - 1; 
		b = b + 1; 
		e = e / 2; 
		f = f * 2; 

		// shorthand assignment operator 
		a += 1; 
		b -= 1; 
		e *= 2; 
		f /= 2;
      	h %= 2;
		System.out.println("a, b, e, f, h ("
						+ "using shorthand operators)= "
						+ a + ", " + b + ", "
						+ e + ", " + f + ", " + h); 
	} 
} 
```
## Relational Operator
Digunakan untuk mengidentifikasi relasi apakah sama, lebih besar dan lebih kecil.
```java
// Java program to illustrate 
// relational operators 
public class operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10; 
		String x = "Thank", y = "Thank"; 
		int ar[] = { 1, 2, 3 }; 
		int br[] = { 1, 2, 3 }; 
		boolean condition = true; 

		// various conditional operators 
		System.out.println("a == b :" + (a == b)); 
		System.out.println("a < b :" + (a < b)); 
		System.out.println("a <= b :" + (a <= b)); 
		System.out.println("a > b :" + (a > b)); 
		System.out.println("a >= b :" + (a >= b)); 
		System.out.println("a != b :" + (a != b)); 

		// Arrays cannot be compared with 
		// relational operators because objects 
		// store references not the value 
		System.out.println("x == y : " + (ar == br)); 

		System.out.println("condition==true :"
						+ (condition == true)); 
	} 
} 
```
## Logical Operator
Digunakan untuk menyelesaikan permasalahan logika matematika AND dan OR.
```java
// Java program to illustrate 
// logical operators 

import java.util.*; 

public class operators { 
	public static void main(String[] args) 
	{ 
		String x = "Sher"; 
		String y = "Locked"; 

		Scanner s = new Scanner(System.in); 
		System.out.print("Enter username:"); 
		String uuid = s.next(); 
		System.out.print("Enter password:"); 
		String upwd = s.next(); 

		// Check if user-name and password match or not. 
		if ((uuid.equals(x) && upwd.equals(y)) 
			|| (uuid.equals(y) && upwd.equals(x))) { 
			System.out.println("Welcome user."); 
		} 
		else { 
			System.out.println("Wrong uid or password"); 
		} 
	} 
} 
```
## Ternary Operator
Versi Pendeknya dari if-else Statement.
- `condition ? if true : if false`

Pada Statement di atas, jika kondisi true maka akan mengeksekusi statement setelah `?` dan jika kondisi false maka akan mengeksekusi statement setelah `:`.
```java
// Java program to illustrate 
// max of three numbers using 
// ternary operator. 
public class operators { 
	public static void main(String[] args) 
	{ 
		int a = 20, b = 10, c = 30, result; 

		// result holds max of three 
		// numbers 
		result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c); 
		System.out.println("Max of three numbers = "
						+ result); 
	} 
} 
```
```java
public class TipeDataLogika{
	public static void main(String[] args){
		Boolean isValid = true;
		System.out.println("Apakah anda sudah login? " + isValid ? "Sudah" : "Belum");
	}
}
```

**Sumber:**
[https://www.geeksforgeeks.org](https://www.geeksforgeeks.org/operators-in-java/#Arithmetic%20Operators)
