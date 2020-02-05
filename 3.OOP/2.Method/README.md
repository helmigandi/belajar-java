# Method
Method adalah sebuah kumpulan statement/perintah yang digunakan untuk menjalankan tugas tertentu. Hasil method dapat dikembalikan (`return`) atau tidak dikembalikan (`void`). 

## Method Declaration

gambar

- **Modifier**-: Memberikan tipe akses pada method. Berikut adalah 4 jenis tipe akses pada method:
	-   public: Dapat diakses oleh seluruh class pada aplikasi.
    -   protected: Dapat diakses di dalam class dan di dalam sublcassnya.
    -   private: Dapat diakses hanya pada class dimana method didefinisikan.
    -   default (tidak menuliskan modifier) : Dapat diakses di dalam class dan package dimana method didefinisikan.
 
- **The return type** : Mengembalikan hasil nilai pada method. `void` jika tidak ada kembalian.

- **Method Name** : Nama Method menggunakan Camel Case. Dimulai dari kata kerja diikuti dengan kata sifat contoh: findSum, computeMax, setX dan getX.

- **Parameter list** : Nilai input data yang akan dimasukkan ke dalam method beserta data typenya.

- **Exception list** : Digunakan untuk menghindari kesalahan input.

-   **Method body** : Kode yang ditulis diantara kurung kurawal.

## Calling the Method
```java
// Program to illustrate methodsin java 
import java.io.*; 

class Addition { 
	
	int sum = 0; 
	
	public int addTwoInt(int a, int b){ 
		
		// adding two integer value. 
		sum = a + b; 
		
		//returning summation of two values. 
		return sum; 
	} 
	
} 

class GFG { 
	public static void main (String[] args) { 
	
		// creating an instance of Addition class 
		Addition add = new Addition(); 
		
		// calling addTwoInt() method to add two integer using instance created 
		// in above step. 
		int s = add.addTwoInt(1,2); 
		System.out.println("Sum of two integer values :"+ s); 
		
	} 
} 
```
## Fungsi Static dan Non-Static
Kata kunci `static` akan membuat fungsi dapat dieksekusi langsung, tanpa harus membuat instansiasi objek dari class.
```java
public class FungsiStatic {
    
    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    
    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }
    
    // fungsi main
    public static void main(String[] args) {
        
        // pemanggilan fungsi static
        minum("Kopi");
        
        
        // mambuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic saya = new FungsiStatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");
        
    }
    
}
// Hasil output dari program di atas:
// Saya sedang minum Kopi
// Hi!
// Saya sedang makan Nasi Goreng
```
Sumber:
- [https://www.petanikode.com/java-oop/](https://www.petanikode.com/java-oop/)
- [https://www.geeksforgeeks.org/methods-in-java/](https://www.geeksforgeeks.org/methods-in-java/)
