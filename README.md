# Object Oriented Programming Concepts

## Object

Kita dapat melihat objek disekitar kita seperti: kucing, Laptop dan Sepeda. Di dalam objek terdapat dua karakteristik yaitu State (Keadaan/ada/nyata) dan Behavior (tingkah laku). Anjing mempunyai state seperti: nama, warna, berkembang biak, dan lapar dan behavior seperti: mengibas ekor, menggonggong dan mengambil. Sepeda juga mempunyai State seperti: gigi saat ini, irama pedal saat ini dan kecepatan saat ini dan behavior seperti: mengganti gigi, menggati irama pedal dan mengerem.

Sebuah object menyimpan state di fields (variabel pada bahasa pemrograman) dan melakukan behavior melalui methods (fungsi pada bahasa pemrograman). Method mengoprasikan object sesuai dengan state untuk berinteraksi dengan objek lain.



## Class

Di dunia nyata, kita akan menemukan objek yang jenisnya sama. Setiap sepeda dibuat dari kumpulan blueprint (kerangka) yang sama dan komponennya pun sama. Di dalam ketentuan object-oriented, sepeda kita adalah contoh dari objek class. Sebuah class adalah blueprint (kerangka) dari object-object yang dibuat.

```java
class Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

Class di atas memiliki fields `cadence`, `speed`, dan `gear` ini merepresentasikan sebuah objek state dan methods (`changeCadence`, `changeGear`, `speedUp` etc.) sehingga dapat berinteraksi dengan dunia luar.

Dapat kita perhatikan bahwa `Bicycle` class tidak memiliki sebuah `main` method. Hal tersebut karena class ini bukan apliakasi yang lengkap. Ini hanya sebuah blueprint untuk sepeda yang mungkin akan digunakan dalam aplikasi. Untuk membuat dan menggunakan `Bicycle` objects terdapat pada kelas lain di dalam aplikasi kita.

Ini adalah `BicycleDemo` class yang membuat dua sepeda `Bicycle` objects yang berbeda dan memanggil methods mereka:

```java
class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
```

Hasil output dari test ini adalah mencetak nilai akhir dari: pedal cadence, speed, and gear dari dua sepeda:

```
cadence:50 speed:10 gear:2
cadence:40 speed:20 gear:3
```

## Inheritance

Mountain bikes, road bikes, dan tandem bikes, adalah contoh dari karakteristik sepeda (gigi saat ini, irama pedal saat ini dan kecepatan saat ini). Namun memiliki beberapa fitur yang berbeda.

Object-oriented programming mengijinkan class untuk *inherit* (mewarisi) penggunaan state dan behavior dari class lain. Dalam hal ini `Bicycle` adalah *superclass* dari `MountainBike`, `RoadBike`, dan `TandemBike`. Di dalam Java, setiap kelas diperbolehkan untuk mempunyai satu superclass secara langsung dan setiap superclass mempunyai jumlah *subclasses* yang tak terbatas.

Syntax untuk membuat subclass sangat simple. Pada awal deklarasi class kita menggunakan `extends` keyword, diikuti dengan nama class yang mewarisi followed by the name of the class:

```java
class MountainBike extends Bicycle {

    // new fields and methods defining 
    // a mountain bike would go here

}
```

Hal ini membuat `MountainBike` memiliki fields (variabel) and methods (behavior) seperti `Bicycle`, namun mengijinkan kode ini untuk membuat fitur secara khusus dan unik. Hal ini membuat kode subclass kita dapat dibaca dengan mudah. Bagaimanapun kita harus berhati-hati dalam mendokumentasikan atau mendefinisikan state dan behavior pada setiap superclass karena code pada superclass tidak muncul di dalam source file disetiap subclass. 

## Interface

Objek dapat melakukan interaksi dengan dunia luar melalui method yang mereka buka/lakukan. Method membentuk objek *interface* dengan dunia luar. Seperti tombol yang ada di televisi, hal ini adalah interface antara kita dan kabel listrik sisi lain dari plastic casing. Ketika kita menekan tombol power untuk menyalakan televisi dan mematikannya.

Sebuah interface adalah kelompok dari method terkait dengan isi atau body yang kosong. Seperti halnya `Bicycle's` behavior (tingkah laku), penggunaan pada interface adalah sebagai berikut:

```java
interface Bicycle {

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
```

Untuk mengimplementasikan interface ini, nama class akan digantikan (untuk brand sepeda tertentu, seperti `ACMEBicycle`), dan kita akan menggunakan `implements` keyword di dalam deklarasi class:

```java
class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
```

## Package

Package adalah sebuah namespace yang mengatur kumpulan kelas-kelas dan interface-interface dari fungsinya. Secara konsep, kita bisa bilang bahwa packages seperti folder yang berlainan di dalam komputer. Kita mungkin menyimpan halaman HTML pada satu folder, gambar di folder lain, dan script aplikasi berada di folder yang lain juga. Aplikasi yang ditulis menggunakan Bahasa Java dapat tersusun dari ratusan atau ribuan kelas. Ini sangat masuk akal untuk menjaga hal tersebut tetap terorganisir dengan cara menempatkan classes (kelas-kelas) dan interfaces (interface-interface) ke dalam Package.

Java menyediakan library class sangat besar (kumpulan packages) yang cocok digunakan untuk aplikasi kita. Library ini disebut juga sebagai Application Programming Interface (API). Setiap packages mewakili tugas yang umumnya berhubungan dengan tujuan umum programming. Sebagai contoh, sebuah `String` objek mengandung state dan behavior untuk karakter string; sebuah `File` objek mengizinkan programmer untuk create, delete, inspect, compare or modify sebuah file di dalam Filesystem; sebuah `socket` objek mengizinkan untuk menciptakan dan menggunakan network sockets; berbagai GUI objek seperti, control button, checkboxes dan yang lainnya berhubungan dengan penggunaan graphical user interfaces.



# Language Basics

## Variables

Pada bahasa pemrograman Java terdapat istilah *field* dan *variable*. Hal ini sangat membingungkan bagi developer baru karena keduanya sering kali merujuk pada hal yang sama.

Sebuah *field* adalah sesuatu yang dapat menyimpan *state* suatu objek. Objek menyimpan *state* dengan cara menyimpan nilai di *field* dan objek satu dengan yang lain dapat memiliki nilai berbeda pada *field* disamping itu **semua *field* adalah variabel di Java**.

Bahasa pemrograman Java memiliki beberapa jenis variabel:

1. Class Variable (Static Fields)
   
   - Merupakan *static variable*
   
   - Dapat dipanggil dengan cara `ClassName.variableName`
   
   - Mereka berbagi salinan nilai yang sama di beberapa *instance/object*. Jadi mereka menyimpan nilai yang sama terlepas dari berapa banyak *instance/object* kelas yang dimiliki.
   
   - Class variable dibuat ketika class dipanggil/dieksekusi ke memori dan dihancurkan ketika kelas tidak lagi dipanggil/diesekusi.
   
   - Secara umum ketika menggunakan static dengan menggunakan konstanta maka nama variabel ditulis dengan huruf besar `public static final string DEPARTMENT_CODE = "departmentCode"`
   
   - Jika static variabel tidak menggunakan konstanta maka penamaan sama dengan instance variable `public static double basicSalary`
   
   - Sebuah field yang mendefinisikan nomor gigi yang digunakan tertentu pada class `bicycle` akan menggunakan `static` yang berarti nomor gigi yang sama akan digukanakan untuk semua *instance*. The code `static int numGears = 6`. Jika menggunakan `final` mengindikasikan nomor gigi yang digunakan tidak pernah berubah.

2. **Instance Variables**
   
   - Merupakan non static variabel pada kelas
   
   - Non-static fields disebut dengan *instance variables* karena nilainya unik untuk setiap *instance* dari class (untuk setiap object). Contohnya `currentSpeed` dari bicycle
   
   - Hanya dapat diakses dengan objek dari kelas, `objectName.variableName`
   
   - Mereka mempunyai nilai sendiri (berbeda) di setiap masing-masing *instance*
   
   - Instance variable dibuat ketika object pada class dibuat menggunakan `new` keyword dan dihancurkan ketika object tidak digunakan
   
   - Contoh: `private String employeeName;`

3. Local Variable
   
   - Ini merupakan variabel yang dideklarasikan di method, constructor atau loop
   
   - Sebuah method sering menyimpan state sementara di local variabel
   
   - Local variabel hanya terlihat pada method yang mendeklarasikannya, sehingga tidak dapat diakses oleh yang lainnya di dalam kelas
   
   - Tidak punya access modifiers
   
   - Ini dibuat ketika block method atau konstruktor dieksekusi dan dihancurkan ketika keluar dari block method atau konstruktor
   
   - Contoh Kode:
     
     ```java
     private void printMyName() {
         String myName = "java"; //myName is a local variable.
         System.out.println(myName);
     }
     ```

4. Parameter Variable
   
   - Ini didefinisikan sebagai argumen jika ingin digunakan pada method, constructors dan lain-lain
   
   - Sebuah Argument adalah nilai yang dikirim ke method ketika method dipanggil. Sebuah Parameter adalah variabel yang digunakan untuk menetapkan nilai tertentu saat mendefinisikan method. Contoh:
     
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

Di awal sudah dijelaskan bahwa *field* adalah sesuatu yang dapat menyimpan *state* suatu objek dan semua *field* adalah variabel di Java. Jadi ada variabel yang tidak termasuk field. Kita dapat simpulkan bahwa class variable dan instance variable adalah field sedangkan local variable dan parameter variable adalah bukan field.

Penamaan variabel yang disepakati:

- Menggunakan huruf pada awal penamaan

- Selanjutnya dapat diikuti dengan huruf, angka, tanda dollar atau underscore dan tidak menggunaka kata yang mengandung reserved word.

- Jika mengandung satu kata, maka menggunakan huruf kecil semua. Jika mengandung lebih dari satu kata, maka kata selanjutnya menggunakan kapital seperti: `currentGear` dan `gearRatio`. Jika variabel mengandung nilai konstanta, seperti: `static final int NUM_GEARS = 6` , maka menggunakan kapital setiap huruf dan pisahkan dengan underscore

## Operator

Operator adalah simbol khusus yang digunakan untuk melakukan operasi secara spesifik dan mengembalikan nilai. Tabel operator di bawah diketik berdasarkan urutan yang akan dieksekusi terlebih dahulu. Operator yang paling atas adalah yang paling tinggi. Operator yang urutannya sejajar memiliki urutan eksekusi yang sama.

| Operators            | Urutan Eksekusi                         |
| -------------------- | --------------------------------------- |
| postfix              | `*expr*++ *expr*--`                     |
| unary                | `++*expr* --*expr* +*expr* -*expr* ~ !` |
| multiplicative       | `* / %`                                 |
| additive             | `+ -`                                   |
| shift                | `<< >> >>>`                             |
| relational           | `< > <= >= instanceof`                  |
| equality             | `== !=`                                 |
| bitwise AND          | `&`                                     |
| bitwise exclusive OR | `^`                                     |
| bitwise inclusive OR | `                                       |
| logical AND          | `&&`                                    |
| logical OR           | `                                       |
| ternary              | `? :`                                   |
| assignment           | `= += -= *= /= %= &= ^=                 |

## Expressions, Statements and Blocks

### Expressions

Expressions adalah sebuah gagasan untuk membuat variabel, operator dan method. Illustrated in bold below:

int **cadence = 0;**

**anArray[0] = 100;**

System.out.println("**Element 1 at index 0: " + anArray[0]**);

int **result = 1 + 2;**

if(**value1 == value2**)

    System.out.println("**value1 == value2**");

### Statements

Statements kurang lebih sama dengan kalimat pada bahasa kita. Berikut adalah tipe dari Statements yang di akhiri dengan semicolon (;):

- Assignment Expressions
  
  `aValue = 8933.234;`

- Any use of `++` or `--`
  
  `aValue++;`

- Method invocations
  
  `System.out.println("Hello World!");`

- Object creation expressions
  
  `Bicycle myBike = new Bicycle();`

### Blocks

Blocks adalah sebuah kelompok nol atau lebih statements. Contoh:

```java
class BlockDemo {
     public static void main(String[] args) {
          boolean condition = true;
          if (condition) { // begin block 1
               System.out.println("Condition is true.");
          } // end block 1
          else { // begin block 2
               System.out.println("Condition is false.");
          } // end block 2
     }
}
```

## Control Flow Statements

The statements di dalam source files umumnya dieksekusi dari atas ke bawah. *Control flow statements* digunakan untuk memutus aliran tersebut dengan mengeksekusi decision making, looping, and branching. Decision-making statements (`if-then`, `if-then-else`, `switch`), the looping statements (`for`, `while`, `do-while`), and the branching statements (`break`, `continue`, `return`).

# 
