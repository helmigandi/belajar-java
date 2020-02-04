Eksekusi Program Java
----------------------------
Berikut alur bagaimana program Java dieksekusi:
1. Kita menulis source code program Java dan simpan dengan nama `Sample.java`.
2. Source code tersebut akan *dicompile* menjadi bytecode. Java Compiler atau `javac` *mengcompile* source code menjadi `Sample.class` file.
3. File class tersebut dapat dieksekusi di platform mana saja dengan bantuan JVM (Java virtual machine).
4. JVM adalah mesin virtual yang mengeksekusi Java bytecodes.
gambar jvm flow

Perbedaan JRE dan JDK
-----------------------------
- The Java Runtime Environment (JRE) adalah paket sofware yang terdiri dari libraries (jars) dan JVM. Untuk mengeksekusi aplikasi Java, kita harus *menginstall* JRE di mesin kita.
- Java Development Kit (JDK) adalah paket software yang mengandung semua yang JRE miliki ditambah dengan pengembangan aplikasi (development tools) untuk membuat aplikasi Java. Kita membutuhkan JDK untuk membuat aplikasi Java
- Perbedaan:
	- JRE= JVM + libraries to run Java application.
	- JDK= JRE + tools to develop Java Application.
gambar JDK JRE

Ketentuan Penamaan dalam Java
----------------------------------------
Java  memiliki pedoman yang harus diikuti programmer agar kode yang dibuat konsisten dan mudah dibaca pembuatan pada aplikasi. Jika di dalam satu tim ada seseorang yang tidak mengikuti ketentuan ini, maka orang lain dalam tim tersebut akan kesulitan untuk membaca dan mengerti kode yang dibuatnya.
Java menggunakan Notasi **Camel Case** untuk penamaan methods, variable, dsb, dan Notasi **Title Case** untuk classes dan interfaces.
1. Packages Naming Conventions
Penamaan package dimulai dari nama domain dengan huruf kecil seperti: com, org, net, dsb). Selanjutnya diikuti dengan nama package yang mungkin berbeda-beda tergantung peraturan penamaan internal perusahaan.
	```java
	package com.howtodoinjava.webapp.controller;
	package com.company.myapplication.web.controller;
	package com.google.search.common;
	```
2. Classes Name Conventions
Pada Java, nama class umumnya adalah nama benda.  Class menggunakan Notasi Title Case dengan huruf pertama setiap kata yang terpisah harus huruf besar.
	```java
	public class ArrayList {}
	public class Employee {}
	public class Record {}
	public class Identity {}
	```
3. Interface Naming Conventions
Nama Interface umumnya menggunakan kata sifat. Interface menggunakan Notasi Title Case dengan huruf pertama setiap kata yang terpisah harus huruf besar. Interface juga bisa menggunakan kata benda ketika terdiri dari bagian class seperti `List` dan `Map`.
	```java
	public interface Serializable {}
	public interface Clonable {}
	public interface Iterable {}
	public interface List {}
	```
4. Methods Naming Conventions
Methods selalu menggunakan kata kerja. Methods menggunakan Notasi Camel Case. Penamaan harus jelas dan mewakili aksi yang dilakukan. Penamaan bisa terdiri dari dua atau lebih kata dengan jelas tergantung kebutuhan.
	```java
	public Long getId() {}
	public void remove(Object o) {}
	public Object update(Object o) {}
	public Report getReportById(Long id) {}
	public Report getReportByName(String name) {}
	```
5. Variable Naming Conventions
	Semua instance, static dan method dengan parameter variable harus menggunakan Notasi Camel Case. Penamaan Variable harus pendek dan jelas. Temporary Variable (Variabel Sementara) dapat menggunakan satu huruf seperti yang digunakan saat counter loops.
	```java
	public Long id;
	public EmployeeDao employeeDao;
	private Properties properties;
	for ( int i = 0; i < list.size(); i++) {
	
	}`
	```
6. Constant Naming Conventions
Semua huruf pada penamaaan konstanta pada Java harus menggunakan huruf besar. Pemisahan kata harus menggunakan underscore (_). Jangan lupa untuk menambahkan modifier `final` untuk menambahkan constanta.
	```java
	public final String SECURITY_TOKEN = "...";
	public final int INITIAL_SIZE = 16;
	public final Integer MAX_SIZE = Integer.MAX;
	```
7. Generic Types Naming Convetions
Penamaan pada Generic Type harus menggunakan satu huruf besar. Huruf `T` untuk Type, huruf `E` untuk collection elements, `S` untuk service loaders dan `K and V` digunakan untuk map keys and value.
	```java
	public interface Map <K,V> {}
	public interface  List<E> extends Collection<E> {}
	Iterator<E> iterator() {}
	```
8. Enumeration Naming Conventions
Sama seperti konstanta, penamaan Enumeration harus huruf besar semua pada kata.
	```java
	enum Direction {NORTH, EAST, SOUTH, WEST}
	```
9. Annotations Naming Conventions
Penamaan Anotasi mengikuti Notasi Title Case. Penamaan bisa berupa kata sifat, kata kerja atau kata benda tergantung kebutuhan.
	```java
	public @interface FunctionalInterface {}
	public @interface Deprecated {}
	public @interface Documented {}
	public @Async Documented {
	public @Test Documented {
	```

Sumber:
[howtodoinjava.com](https://howtodoinjava.com/java/basics/java-naming-conventions/)
