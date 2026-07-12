# Assignment S109

## General info:

**Project description**:<br>
This project uses enums to represent finite and controlled values, dates and times with the Java Time API to work with time robustly, and records, 
a novelty of Java to declare classes of immutable data with less code.

**Technologies**: Backend Java

**Prerequisites:**<br>
* **Maven**: Required to download external dependencies (JUnit and AssertJ for testing)

**Installation and Compilation**:

1. Clone repository:<br>
   https://github.com/bmestres/tascaS109.git
2. Navigate to the project root directory:<br>
   `cd tascaS109`
3. Resolve dependencies and compile the project using Maven:<br>
   `mvn clean compile`

## Level 1:
Work on the creation of enums, the use in conditions and classes, 
and how to extract useful information from them.

### Exercises:
Creation of an enum type called Day containing the days of the week. Adds a method that receives a Day and prints if it is workable or weekend.
Creation of an enum named level with low, medium and high values. Creates a Task class with a Level property and shows how the behavior changes based on the level.
Adds method getColor() and checks logic correctness.
Method to convert a String to enum and handle errors if the value is invalid.

**Execution:**
````bash
java -cp target/classes level01.exercise01.Main
java -cp target/classes level01.exercise02.Main
java -cp target/classes level01.exercise03.Main
java -cp target/classes level01.exercise04.Main
````


## Level 2:
Representing time (LocalDate, LocalTime, LocalDateTime), make time calculations, compare dates, format them and work with agendas.

### Exercises:
Displaying the current date and time with LocalDate, LocalTime and LocalDateTime.
Calculates the difference between two dates with Period class.
Add or subtract days, months or hours to a date.
Formats a date with DateTimeFormatter (in various formats).
Creates a function that checks if a date passed as a parameter is earlier than today.
Creates an agenda with dates saved as LocalDateTime and shows the next ones.


**Execution:**
```bash
java -cp target/classes level02.exercise01.Main
java -cp target/classes level02.exercise02.Main
java -cp target/classes level02.exercise03.Main
java -cp target/classes level02.exercise04.Main
java -cp target/classes level02.exercise05.Main
java -cp target/classes level02.exercise06.Main
```

## Level 3:
Practice the use of records; add basic logic, validate values and compare them with normal classes. 

### Exercises:<br>
Create and instantiate records, add custom behavior, enforce data validation in the canonical constructor, process 
collections of records with lambdas and streams, and compare records with traditional classes to understand their advantages in readability and code simplicity.


**Execution:**
```bash
java -cp target/classes level03.exercise01.Main
java -cp target/classes level03.exercise02.Main
java -cp target/classes level03.exercise03.Main
java -cp target/classes level03.exercise04.Main
```


**Note:**<br> The main difference between regular classes and records is the immutability of records in contrast with 
the flexibility of a regular class. On the other hand, record simplifies code readability making easier to construct.
Getters are substituted with direct access methods through the instance variable. Instantiation of records gets simpler and more straightforward that class instances. 
In terms of treatment as elements of a collection, record instances behave similarly to class instances and they are filtered, sorted and found
with analog operations.


#### Project overall structure:
```text
.
├── README.md
├── pom.xml
└── src
    ├── main
    │   ├── java
    │   │   ├── level01
    │   │   ├── level02
    │   │   └── level03
    │   └── resources
    └── test
        └── java
            ├── Level03
            ├── level01
            └── level02
```
