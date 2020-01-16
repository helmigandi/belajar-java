Variable
----------
1.  Pengertian Variable
Variable adalah nama yang merujuk pada suatu area memori dimana value atau nilai disimpan. Variable bisa juga merupakan perintah untuk komputer menyimpan suatu nilai di *RAM*.

Inline-style: 
![Variable-Example](https://github.com/helmiz/belajar-java/blob/master/3.Java-Basics/1.Variable/varaible-example.jpg "Variable-Example")


Dalam membuat vairable biasa disebut deklarasi dan pemberian nilai ke variable tertentu disebut inisialisasi.
Contoh:
	```java
	public class DataTypeDeclaration {

	    // inilah yang disebut deklarasi
	    public java.lang.Integer serverPort;

	    public void setServerPort(){
	        // ini lah yang disebut inisialisasi terhadap variable
	        this.serverPort = 10;
	    }
	}
	```
2. Penulisan Variable
`[data_type] [variable_name] = [variable_value];`
-   **data_type**: Jenis informasi yang disimpan di area memory.
-   **variable_name**: Nama variable refer to name of variable.
-   **variable_value**: Nilai yang disimpan di area memory.
Contoh:
	```java
	int i = 10;	//Variable of int type
	String str = "howtodoinjava.com";	//Variable of string type
	Object obj = new Object();	//Variable of object type
	int[] scores =[1,2,3,4,5,6,7,8,9];	//Variable of int type
	```
3. Jenis Variable
Hal ini sudah dijelaskan pada konsep OOP sebelumnya.
	- Class Variable
Bisa juga disebut variable punyanya class. Dideklarasikan menggunakan `static`. Variable ini berbagi salinan nilai yang sama di beberapa *instance/object*.
	- Instance Variable
Bisa juga disebut variable punyanya object. nilainya unik untuk setiap *instance* di dalam class.
Contoh untuk Instance variable dan Class variable:
		Data.java
		```java
		public class Data
		{
		int counter = 20;
		static float PI = 3.14f;
		}
		```
		Main.java
		```java
		public class Main
		{
			public static void main(String[] args)
			{
				Data dataInstance = new Data();
				//Need new instance
				System.out.println( dataInstance.counter );	//20
				//Can access using class reference
				System.out.println( Data.PI );	//3.14
			}
		}
		```
	- Local Variable
Ini merupakan variabel yang dideklarasikan di method, constructor atau loop. Sebuah method sering menyimpan state sementara di local variabel.
		```java
		public class VariableExample
		{
			public static void main( String[] args ) {
			int age = 30;	//3 - Local variable (inside method body)`
			}
		}
		```
	- Parameter Variable
Sebuah Argument adalah nilai yang dikirim ke method ketika method dipanggil. Sebuah Parameter adalah variabel yang digunakan untuk menetapkan nilai tertentu saat mendefinisikan method. Contoh:
		```java
		public class ArithmeticOperations {
	        public static int add(int x, int y) { //x, y are parameters here
			return x + y;
         }
	    public static void main(String[] args) {
             int x = 10;
             int y = 20;
             int sum = add(x, y); //x, y are arguments here
             System.out.println("SUM IS: " +sum);
	         }
	     }
		```
4. Penamaan Variable
	- Case Sensitive.
	- Kata pertama dimulai dengan huruf atau `$` atau `_`.
	- Setelah kata pertama, kata berikutnya dapat diikuti angka, `$` atau `_`.
	- Tidak boleh menggunakan *Reserved Word*.
	- Harus ditulis dengan huruf kecil. Seperti, `apel` atau `variable`.
	- Jika nama variable terdapat banyak kata, maka ikuti notasi *camel case*. Seperti, `deptName` atau `firstName`.
	- Jika menggunakan *static final* atau konstanta maka nama harus huruf besar semua dan dapat menggunakan `_` sebagai pemisah. Seperti, `LOGGER` atau `INTEREST_RATE`.


Sumber:
- [howtodoinjava.com](https://howtodoinjava.com/java/basics/java-variables/)
- [www.dimas-maryanto.com/bootcamp/java/](https://www.dimas-maryanto.com/bootcamp/java/core/006-data-type-and-variables)
