# Java Time
Java memiliki `java.time` package untuk bekerja dengan tanggal dan waktu. Berikut adalah pengertian package jika masih bingung:

> A package in Java is used to group related classes. Think of it as **a folder in a file directory**. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
> -   Built-in Packages (packages from the Java API)
> -   User-defined Packages (create your own packages)

## LocalDate
Digunakan saat bekerja dengan tanggal saja, seperti: tanggal, bulan, dan tahun (year, month, day (yyyy-MM-dd)).
```java
import java.time.LocalDate; // import the LocalDate class

public class MyClass {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now(); // Create a date object
    System.out.println(myObj); // Display the current date
  }
}
// 2020-01-29
``` 

## LocalTime
Digunakan saat bekerja dengan waktu tanpa tanggal (hour, minute, second and milliseconds (HH-mm-ss-zzz)).
```java
import java.time.LocalTime; // import the LocalTime class

public class MyClass {
  public static void main(String[] args) {
    LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
  }
}
// 09:21:20.914905
```

##  LocalDateTime
Digunakan untuk bekerja dengan tanggal dan waktu (yyyy-MM-dd-HH-mm-ss.zzz).
```java
import java.time.LocalDateTime; // import the LocalDateTime class

public class MyClass {
  public static void main(String[] args) {
    LocalDateTime myObj = LocalDateTime.now();
    System.out.println(myObj);
  }
}
// 2020-01-29T09:21:20.916451
```

## DateTimeFormatter
Digunakan untuk melakukan format tanggal dan waktu.
```java
import java.time.LocalDateTime; // Import the LocalDateTime class
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class

public class MyClass {
  public static void main(String[] args) {
    LocalDateTime myDateObj = LocalDateTime.now();
    System.out.println("Before formatting: " + myDateObj);
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
// Before Formatting: 2020-01-29T09:21:20.916023  
// After Formatting: 29-01-2020 09:21:20
```

## Util.Date
Penanggalan versi java lama yang sudah jarang digunakan.
```java
import java.util.Date;
import java.text.SimpleDateFormat;

public class TipeDataDatePrimitif {

    public static void main(String[] args) throws Exception {
        Date tanggalSekarang = new Date();
        // tanggalnya di format sesuai yang kita inginkan
	SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy hh:mm:ss z");
        System.out.println("Tanggal Sekarang adalah " + sdf.format(tanggalSekarang));
    }
}
// 07 Nov 2017 23:12:40 WIB
```

**Sumber:**
- [https://www.w3schools.com/JAVA/java_date.asp](https://www.w3schools.com/JAVA/java_date.asp)
- [https://www.w3schools.com/JAVA/java_packages.asp](https://www.w3schools.com/JAVA/java_packages.asp)
- [https://www.geeksforgeeks.org/java/](https://www.geeksforgeeks.org/java/)
