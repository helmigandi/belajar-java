# Class
Class adalah *prototype* dari object yang akan dibuat. Hal ini menggambarkan objek yang kita buat.
```java
public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
  }
}
```

 Contoh lainnya sebuah sepeda. Sepeda ini jadi dia memiliki sifat dan prilaku, sifat dan prilaku ini lah yang disebut _variables_ dan _functions_. Contohnya `roda`, `speed`, `mengikatkanKecepatan()`, `menurunkanKecepatan()`, `jumlahPenumpang` jadi klo saya buat _class_ seperti berikut:
```java
public class Sepeda {

    private Integer roda = 2;
    private Integer kecepatan = 0;

    public void meningkatkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan + value;
    }

    public void turunkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan - value;
    }

    public Integer kecepatanSekarang() {
        return this.kecepatan;
    }
}
```

# Object
Object adalah dasar dari sebuah OOP dan menggambarkan wujud dalam kehidupan. Jadi tadi kita sudah membuat kerangka objek (class) jadi sekarang bagaimana supaya object itu hidup. Caranya dengan inisialisasi object. Inisialisasi object biasanya menggunakan keyword `new` kemudian diikuti dengan nama _class_ yang mau digunakan. Object terdiri dari:
1. State: Menggambarkan atribut dari sebuah object.
2. Behavior: Menggambarkan Method.
3. Identity: Nama unik untuk sebuah objek.

gambar

Pada Online Shop system memiliki object seperti: shopping cart, customer, dan product.

## Declare Object and Instantiating a Class
Saat Object sudah dibuat maka class siap di *instantiated*. Semua instances berbagi atribut dan behavior dari class. tetapi nilai atribut unik.
> In programming terms, you can have a class called Apple, which has variables size:big, shape:round, habitat:grows on trees. To have 5 apples in your basket, you need to **_instantiate_** 5 apples. `Apple apple1, Apple apple2, Apple apple3 etc...`

gambar

## Initializing an object
```java
// Class Declaration 

public class Dog 
{ 
	// Instance Variables 
	String name; 
	String breed; 
	int age; 
	String color; 

	// Constructor Declaration of Class 
	public Dog(String name, String breed, 
				int age, String color) 
	{ 
		this.name = name; 
		this.breed = breed; 
		this.age = age; 
		this.color = color; 
	} 

	// method 1 
	public String getName() 
	{ 
		return name; 
	} 

	// method 2 
	public String getBreed() 
	{ 
		return breed; 
	} 

	// method 3 
	public int getAge() 
	{ 
		return age; 
	} 

	// method 4 
	public String getColor() 
	{ 
		return color; 
	} 

	@Override
	public String toString() 
	{ 
		return("Hi my name is "+ this.getName()+ 
			".\nMy breed,age and color are " + 
			this.getBreed()+"," + this.getAge()+ 
			","+ this.getColor()); 
	} 

	public static void main(String[] args) 
	{ 
		Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
		System.out.println(tuffy.toString()); 
	} 
} 
//Hi my name is tuffy.
//My breed,age and color are papillon,5,white
```
Pada class di atas memiliki constructor yang digunakan untuk initialize objects. Constructor pada _Dog_ class  memiliki empat parameter yang diikuti dengan statement “tuffy”,”papillon”,5,”white” sebagai nilai arguments:
`Dog tuffy = new Dog("tuffy","papillon",5, "white");`

gambar

## Multiple Classes
Kita dapat membuat object class dan mengaksesnya dari class lain. Hal ini sering digunakan supaya lebih mudah dalam pengaturannya. Jadi satu class memiliki semua attributes dan methods, sedangkan class lain memiliki `main()` method yang dapat mengeksekusi.
Class Sepeda:
```java
public class Sepeda {

    private Integer roda = 2;
    private Integer kecepatan = 0;

    public void meningkatkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan + value;
    }

    public void turunkanSpeed(Integer value) {
        this.kecepatan = this.kecepatan - value;
    }

    public Integer kecepatanSekarang() {
        return this.kecepatan;
    }

}
```
Main Class:
```java
public class MainAplikasi{

    public static void main(String[] args){
        Sepeda ontel = new Sepeda();
        ontel.meningkatkanSpeed(20);
        System.out.println("Kecepatan sepeda ontel saat ini adalah " + ontel.kecepatanSekarang());

        Sepeda balap = new Sepeda();
        balap.meningkatkanSpeed(120);
        System.out.println("Kecepatan sepeda balap saat ini adalah " + balap.kecepatanSekarang());
    }
}
```

**_Sumber_**:
- [https://www.dimas-maryanto.com/bootcamp/java/core/028-class-oop](https://www.dimas-maryanto.com/bootcamp/java/core/028-class-oop)
- [https://www.geeksforgeeks.org/classes-objects-java/](https://www.geeksforgeeks.org/classes-objects-java/)
