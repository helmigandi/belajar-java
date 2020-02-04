# Package
Secara konsep, kita bisa bilang bahwa packages seperti folder yang berlainan di dalam komputer. Kita mungkin menyimpan halaman HTML pada satu folder, gambar di folder lain, dan script aplikasi berada di folder yang lain juga. Aplikasi yang ditulis menggunakan Bahasa Java dapat tersusun dari ratusan atau ribuan kelas. Hal ini sangat masuk akal untuk menjaga hal tersebut tetap terorganisir dengan cara menempatkan classes (kelas-kelas) ke dalam Package.

## Cara Kerja Package
Nama package sama seperti struktur direktori. Contoh nama package `college.staff.cse`, yang berarti ada tiga buah direktori yaitu direktori `college`, `staff` dan `cse`. Berikut adalah hal penting pada package:
- **Penamaan package**, pada Java seperti nama domain tetapi dibalik seperti: `org.geeksforgeeks.practice`.
- **Menambahkan Class pada package**, kita dapat menambahkan class ke package dengan cara menuliskan nama package di atas program dan tempatkan class pada direktori package
- **Subpackages**, package yang berada di dalam package adalah subpackage.
Contoh:
`import java.util.*;`
**util** adalah subpackage yang dibuat di dalam package **Java**.

## Jenis Package
1. Built-in Package
Package yang disediakan oleh **Java API**. Seperti:
	- `java.lang`: Package yang untuk mendukung pengoprasian class (Tipe data primitive, math operations). Package otomatis terimport.
	- `java.io`
	- `java.util`
	- dsb.
2. User-defined Package
Package yang dibuat oleh user. Contoh:
	- Buat direktori `src` untuk menyimpan file java dan `bin` untuk menyimpan hasil compile.
	- Di dalam direktori `src` buat direktori `com`di dalamnya terdapat direktori `tutorial` dan di dalamnya terdapat 	`latihan1`.
	- Membuat file java di dalam direktori `latihan1`:
		```java
		package latihan1; //nama package

		public class TestPackage{
		    public void getNames(String s){        
		        System.out.println(s);        
		    }
		}
		```
	- Membuat file java pada `Control.java`:
		```java
		/* import 'TestPackage' class from 'names' latihan1 */
		import com.tutorial.latihan1.TestPackage;

		public class Control 
		{
		   public static void main(String args[]) 
			   {       
		      // Initializing the String variable 
		      // with a value 
		      String name = "Selamat Belajar Package Java";
      
		      // Creating an instance of class TestPackage in 
		      // the package.
		      TestPackage obj = new TestPackage();
      
		      obj.getNames(name);
			   }
		}
		```
	- Tampilan Tree:
		![gambar ss](https://github.com/helmiz/belajar-java/blob/master/2.Java-Basics/8.Package/Ss.png "Tree image")

	- Masuk ke dalam direktori `src` lewat cmd/terminal lalu compile Control.java dengan cara:
	`javac Control.java -d ../bin`
	- Jalankan hasil compile di dalam direktori `bin`:
	`java control`
	Jika file Mainnya ada di dalam package maka gunakan pemisah titik seperti:
	`java com.tutorial.Main`

## Penggunaan Static
Pada saat menggunakan keyword static pada package, kita dapat langsung mengakses anggota class yang bersifat static juga secara langsung tanpa class name atau object. Sebagai contoh kita akan mengakses sqrt() method dari Math class menggunakan **Math.sqrt()**. 

> According to SUN microSystem, it will improve the code readability and enhance coding. But according to the programming experts, it will lead to confusion and not good for programming. If there is no specific requirement then we should **not** go for static import.

```java
// Java to illustrate calling of static member of 
// System class without Class name 
import static java.lang.Math.*; 
import static java.lang.System.*; 
class Geeks { 
	public static void main(String[] args) 
	{ 
		// We are calling static member of System class 
		// directly without System class name 
		out.println(sqrt(4)); 
		out.println(pow(2, 2)); 
		out.println(abs(6.3)); 
	} 
} 
// Output:
// 2.0
// 4.0
// 6.3
```

## Penanganan Conflict pada Nama
Sebagai Contoh pada saat kita menggunakan package tanggal yaitu `java.util` dan `java.sql` yang memiliki class Date. Jika kita import seperti program dibawah:
```
import java.util.*;
import java.sql.*;

//And then use Date class, then we will get a compile-time error :

Date today ; //ERROR-- java.util.Date or java.sql.Date?
```
Untuk memecahkan masalah tersebut kita harus import secara spesifik:
```
import java.util.Date;
import java.sql.*;
```
Jika kita membutuhkan class Date maka kita dapat menggunakan nama package secara lengkap setiap kali mendeklarasikan object pada class tersebut. Contoh:
```
java.util.Date deadLine = new java.util.Date();
java.sql.Date today = new java.sql.Date();
```

**Sumber:**
- [https://www.geeksforgeeks.org/packages-in-java/](https://www.geeksforgeeks.org/packages-in-java/)
