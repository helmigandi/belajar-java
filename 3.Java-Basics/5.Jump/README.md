# Jump
Java support 3 jenis jump statement: **break**, **continue** dan **return**.

## Break

![break](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/5.Jump/exit.png "Break")

- Digunakan pada Switch-Case
- Untuk keluar dari loop
	```java
	// Java program to illustrate using 
	// break to exit a loop 
	class BreakLoopDemo 
	{ 
		public static void main(String args[]) 
		{ 
			// Initially loop is set to run from 0-9 
			for (int i = 0; i < 10; i++) 
			{ 
				// terminate loop when i is 5. 
				if (i == 5) 
					break; 

				System.out.println("i: " + i); 
			} 
			System.out.println("Loop complete."); 
		} 
	} 
	```
	Output:
	```
	i: 0
	i: 1
	i: 2
	i: 3
	i: 4
	Loop complete.
	```
- Keluar dari block
Java menggunakan label untuk mengidentifikasi block code.
	```java
		// Java program to illustrate using break with goto 
	class BreakLabelDemo 
	{ 
		public static void main(String args[]) 
		{ 
			boolean t = true; 

			// label first 
			first: 
			{ 
				// Illegal statement here as label second is not 
				// introduced yet break second; 
				second: 
				{ 
					third: 
					{ 
						// Before break 
						System.out.println("Before the break statement"); 

						// break will take the control out of 
						// second label 
						if (t) 
							break second; 
						System.out.println("This won't execute."); 
					} 
					System.out.println("This won't execute."); 
				} 

				// First block 
				System.out.println("This is after second block."); 
			} 
		} 
	} 
	```
	Output:
	```
	Before the break.
	This is after second block.
	```

## Continue

![Continue](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/5.Jump/continue-1.png "Continue Text")

Program akan menghentikan iterasi dan melanjutkan pada iterasi berikutnya pada perulangan.
```java
// Java program to illustrate using 
// continue in an if statement 
class ContinueDemo 
{ 
	public static void main(String args[]) 
	{ 
		for (int i = 0; i < 10; i++) 
		{ 
			// If the number is even 
			// skip and continue 
			if (i%2 == 0) 
				continue; 

			// If number is odd, print it 
			System.out.print(i + " "); 
		} 
	} 
} 
```

## Return
digunakan secara jelas untuk pengembalian nilai dari sebuah method.
```java
// Java program to illustrate using return 
class Return 
{ 
	public static void main(String args[]) 
	{ 
		boolean t = true; 
		System.out.println("Before the return."); 
	
		if (t) 
			return; 

		// Compiler will bypass every statement 
		// after return 
		System.out.println("This won't execute."); 
	} 
} 
// Java program to illustrate using return 
class Return 
{ 
	public static void main(String args[]) 
	{ 
		boolean t = true; 
		System.out.println("Before the return."); 
	
		if (t) 
			return; 

		// Compiler will bypass every statement 
		// after return 
		System.out.println("This won't execute."); 
	} 
} 
```

**Sumber:**
[https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/](https://www.geeksforgeeks.org/decision-making-javaif-else-switch-break-continue-jump/)
