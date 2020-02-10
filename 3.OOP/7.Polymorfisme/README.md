# Polimorfhisme
Polimorfisme dalam OOP adalah sebuah prinsip di mana class dapat memiliki banyak **“bentuk”** method yang berbeda-beda meskipun namanya sama. **“Bentuk”** di sini dapat kita artikan: isinya berbeda, parameternya berbeda, dan tipe datanya berbeda.
Polimorfisme pada Java ada dua macam:

1.  Static Polymorphism (Polimorfisme statis) yaitu **method overloading**.
2.  Dynamic Polymorphism (Polimorfisme dinamis) yaitu **method overriding**.

## Upcasting
Digunakan saat Superclass merujuk pada Subclass Object.

gambar 1

```java
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.o
```

```java
println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}
```

Sumber:
- [https://www.petanikode.com/java-oop-polimorfisme/](https://www.petanikode.com/java-oop-polimorfisme/)
- [https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/](https://www.geeksforgeeks.org/dynamic-method-dispatch-runtime-polymorphism-java/)
- [https://www.w3schools.com/JAVA/java_polymorphism.asp](https://www.w3schools.com/JAVA/java_polymorphism.asp)
- [https://www.dimas-maryanto.com/bootcamp/java/core/031-polymorpism-java](https://www.dimas-maryanto.com/bootcamp/java/core/031-polymorpism-java)

