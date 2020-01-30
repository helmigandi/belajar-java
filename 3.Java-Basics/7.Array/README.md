# Array
Array digunakan untuk menyimpan kumpulan variable yang jenisnya sama dalam satu variable.
**Instantiating an Array in Java**
```
int intArray[];    //declaring array
intArray = new int[20];  // allocating memory to array
```
OR
```
int[] intArray = new int[20]; // combining both statements in one
```

**Array Literal**
```
 int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
 // Declaring array literal
 ```
 
**Accessing Java Array Elements using for Loop**
```java
// accessing the elements of the specified array
for (int i = 0; i < arr.length; i++)
  System.out.println("Element at index " + i + " : "+ arr[i]);
```

**Implementation:**
```java
// Java program to illustrate creating an array 
// of integers, puts some values in the array, 
// and prints each value to standard output. 

class GFG 
{ 
	public static void main (String[] args) 
	{		 
	// declares an Array of integers. 
	int[] arr; 
		
	// allocating memory for 5 integers. 
	arr = new int[5]; 
		
	// initialize the first elements of the array 
	arr[0] = 10; 
		
	// initialize the second elements of the array 
	arr[1] = 20; 
		
	//so on... 
	arr[2] = 30; 
	arr[3] = 40; 
	arr[4] = 50; 
		
	// accessing the elements of the specified array 
	for (int i = 0; i < arr.length; i++) 
		System.out.println("Element at index " + i + 
									" : "+ arr[i]);		 
	} 
}  
/*
Element at index 0 : 10
Element at index 1 : 20
Element at index 2 : 30
Element at index 3 : 40
Element at index 4 : 50
*/
```

**Arrays of Objects**
```java
// Java program to illustrate creating an array of 
// objects 

class Student 
{ 
	public int roll_no; 
	public String name; 
	Student(int roll_no, String name) 
	{ 
		this.roll_no = roll_no; 
		this.name = name; 
	} 
} 

// Elements of array are objects of a class Student. 
public class GFG 
{ 
	public static void main (String[] args) 
	{ 
		// declares an Array of integers. 
		Student[] arr; 

		// allocating memory for 5 objects of type Student. 
		arr = new Student[5]; 

		// initialize the first elements of the array 
		arr[0] = new Student(1,"aman"); 

		// initialize the second elements of the array 
		arr[1] = new Student(2,"vaibhav"); 

		// so on... 
		arr[2] = new Student(3,"shikar"); 
		arr[3] = new Student(4,"dharmesh"); 
		arr[4] = new Student(5,"mohit"); 

		// accessing the elements of the specified array 
		for (int i = 0; i < arr.length; i++) 
			System.out.println("Element at " + i + " : " + 
						arr[i].roll_no +" "+ arr[i].name); 
	} 
} 
/*
Element at 0 : 1 aman
Element at 1 : 2 vaibhav
Element at 2 : 3 shikar
Element at 3 : 4 dharmesh
Element at 4 : 5 mohit
*/
```

**Multidimensional Arrays**
```
int[][] intArray = new int[10][20]; //a 2D array or matrix
int[][][] intArray = new int[10][20][10]; //a 3D array
```
Example
```java
class multiDimensional 
{ 
	public static void main(String args[]) 
	{ 
		// declaring and initializing 2D array 
		int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 

		// printing 2D array 
		for (int i=0; i< 3 ; i++) 
		{ 
			for (int j=0; j < 3 ; j++) 
				System.out.print(arr[i][j] + " "); 

			System.out.println(); 
		} 
	} 
} 
```

**Passing Arrays to Methods**
```java// Java program to demonstrate 
// passing of array to method 

class Test 
{	 
	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = {3, 1, 2, 5, 4}; 
		
		// passing array to method m1 
		sum(arr); 
	
	} 

	public static void sum(int[] arr) 
	{ 
		// getting sum of array values 
		int sum = 0; 
		
		for (int i = 0; i < arr.length; i++) 
			sum+=arr[i]; 
		
		System.out.println("sum of array values : " + sum); 
	} 
} 
```

**Returning Arrays from Methods**
```java
// Java program to demonstrate 
// return of array from method 

class Test 
{	 
	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = m1(); 
		
		for (int i = 0; i < arr.length; i++) 
			System.out.print(arr[i]+" "); 
	
	} 

	public static int[] m1() 
	{ 
		// returning array 
		return new int[]{1,2,3}; 
	} 
} 
```

**Sumber:**
[https://www.geeksforgeeks.org/arrays-in-java/](https://www.geeksforgeeks.org/arrays-in-java/)
