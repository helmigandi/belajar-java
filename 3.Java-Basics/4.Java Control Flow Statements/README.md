# Java Control Flow Statement
## If-Else
Program akan mengeksekusi bagian kode tertentu. Kika kondisi terpenuhi maka nilainya `true` jika tidak maka  `false`.

![if elseif](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/if-elseif.png "If else if")

```java
// Java program to illustrate if-else-if ladder 
class ifelseifDemo 
{ 
	public static void main(String args[]) 
	{ 
		int i = 20; 

		if (i == 10) 
			System.out.println("i is 10"); 
		else if (i == 15) 
			System.out.println("i is 15"); 
		else if (i == 20) 
			System.out.println("i is 20"); 
		else
			System.out.println("i is not present"); 
	} 
} 
```

## Nested-If
Nested-If berarti if statement di dalam if-statement.

![Nested If](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/nested-if-modified-1.png "Nested if")

```java
// Java program to illustrate nested-if statement 
class NestedIfDemo 
{ 
	public static void main(String args[]) 
	{ 
		int i = 10; 

		if (i == 10) 
		{ 
			// First if statement 
			if (i < 15) 
				System.out.println("i is smaller than 15"); 

			// Nested - if statement 
			// Will only be executed if statement above 
			// it is true 
			if (i < 12) 
				System.out.println("i is smaller than 12 too"); 
			else
				System.out.println("i is greater than 15"); 
		} 
	} 
} 
```

## Switch Statement
Switch Statement memiliki banyak jalur sesuai hasil eksekusi yang terjadi.

![Switch](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/switch-case.png "Switch")

```java
// Java program to illustrate switch-case 
class SwitchCaseDemo 
{ 
	public static void main(String args[]) 
	{ 
		int i = 9; 
		switch (i) 
		{ 
		case 0: 
			System.out.println("i is zero."); 
			break; 
		case 1: 
			System.out.println("i is one."); 
			break; 
		case 2: 
			System.out.println("i is two."); 
			break; 
		default: 
			System.out.println("i is greater than 2."); 
		} 
	} 
} 
``` 
### Penggunaan `break` pada Switch
Pada Switch penggunaan `break` adalah opsional. Jika tidak menggunakan `break` maka eksekusi kode program akan berlanjut pada `case` selanjutnya.
```java
// Java program to demonstrate switch case 
// with multiple cases without break statements 
public class Test { 
	public static void main(String[] args) 
	{ 
		int day = 2; 
		String dayType; 
		String dayString; 

		switch (day) { 
		case 1: 
			dayString = "Monday"; 
			break; 
		case 2: 
			dayString = "Tuesday"; 
			break; 
		case 3: 
			dayString = "Wednesday"; 
			break; 
		case 4: 
			dayString = "Thursday"; 
			break; 
		case 5: 
			dayString = "Friday"; 
			break; 
		case 6: 
			dayString = "Saturday"; 
			break; 
		case 7: 
			dayString = "Sunday"; 
			break; 
		default: 
			dayString = "Invalid day"; 
		} 

		switch (day) { 
		// multiple cases without break statements 

		case 1: 
		case 2: 
		case 3: 
		case 4: 
		case 5: 
			dayType = "Weekday"; 
			break; 
		case 6: 
		case 7: 
			dayType = "Weekend"; 
			break; 

		default: 
			dayType = "Invalid daytype"; 
		} 

		System.out.println(dayString + " is a " + dayType); 
	} 
} 
```
### Nested Switch Case statements
```java
// Java program to demonstrate 
// nested switch case statement 
public class Test { 
	public static void main(String[] args) 
	{ 
		String Branch = "CSE"; 
		int year = 2; 

		switch (year) { 
		case 1: 
			System.out.println("elective courses : Advance english, Algebra"); 
			break; 
		case 2: 
			switch (Branch) // nested switch 
			{ 
			case "CSE": 
			case "CCE": 
				System.out.println("elective courses : Machine Learning, Big Data"); 
				break; 

			case "ECE": 
				System.out.println("elective courses : Antenna Engineering"); 
				break; 

			default: 
				System.out.println("Elective courses : Optimization"); 
			} 
		} 
	} 
} 
```

## While Loops
While loops mengizinkan kode dapat dieksekusi secara berulang tergantung pada kondisinya.

![while loop](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/Loop1.png "While loop")

```java
// Java program to illustrate while loop 
class whileLoopDemo 
{ 
	public static void main(String args[]) 
	{ 
		int x = 1; 

		// Exit when x becomes greater than 4 
		while (x <= 4) 
		{ 
			System.out.println("Value of x:" + x); 

			// Increment the value of x for 
			// next iteration 
			x++; 
		} 
	} 
} 
```

## For Loop
For loop memberikan perulangan secara rinkas dan dapat dibaca. Tidak seperti while loop, for loop menuliskan initialization, condition dan increment/decrement pada baris yang sama.

![for loop](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/loop2.png "Foor loop")

```java
// Java program to illustrate for loop. 
class forLoopDemo 
{ 
	public static void main(String args[]) 
	{ 
		// for loop begins when x=2 
		// and runs till x <=4 
		for (int x = 2; x <= 4; x++){ 
			System.out.println("Value of x:" + x);
        }
	} 
} 
```

## Enhanced For Loop
Biasanya digunakan pada array.
**Syntax:**
```
for (type var : array) 
{ 
    statements using var;
}
```
**Sama dengan cara:**
```
for (int i=0; i<arr.length; i++) 
{ 
    type var = arr[i];
    statements using var;
}
```
Contoh:
```java
// Java program to illustrate enhanced for loop 
public class enhancedforloop 
{ 
	public static void main(String args[]) 
	{ 
		String array[] = {"Ron", "Harry", "Hermoine"}; 

		//enhanced for loop 
		for (String x:array) 
		{ 
			System.out.println(x); 
		} 

		/* for loop for same function 
		for (int i = 0; i < array.length; i++) 
		{ 
			System.out.println(array[i]); 
		} 
		*/
	} 
} 
```

## Do While
Sama seperti While loop perbedaannya mengeksekusi statement sebelum melakukan pengecekan kondisi.

![do while](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/4.Java%20Control%20Flow%20Statements/img/loop3.png "Do While")

```java
// Java program to illustrate do-while loop 
class dowhileloopDemo 
{ 
	public static void main(String args[]) 
	{ 
		int x = 21; 
		do
		{ 
			// The line will be printed even 
			// if the condition is false 
			System.out.println("Value of x:" + x); 
			x++; 
		} 
		while (x < 20); 
	} 
} 
```

**Sumber**:
[https://www.geeksforgeeks.org/switch-statement-in-java/](https://www.geeksforgeeks.org/switch-statement-in-java/)
[https://www.geeksforgeeks.org/loops-in-java/](https://www.geeksforgeeks.org/loops-in-java/)
[https://howtodoinjava.com/java/basics/control-flow-statements/](https://howtodoinjava.com/java/basics/control-flow-statements/)
