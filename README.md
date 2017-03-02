# Codeguide

## Polymorphism
Definition : Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism 
in OOP occurs when a parent class reference is used to refer to a child class object.

In the example below, there are 2 class, A bike is a super class and a splender is a subclass of bike.
```java
class Bike {
  public void run() {
    System.out.println("running");
  }
}
```

```java
class Splender extends Bike {
  public void run() {
    System.out.println("running safely with 60km");
  }
 
  public static void main(String args[]) {
     Bike b = new Splender();//upcasting
     b.run();
   }
 }
```
According to the example, we are creating two classes Bike and Splendar. Splendar class extends Bike class and overrides its run() method.
We are calling the run method by the reference variable of Parent class.
Since it refers to the subclass object and subclass method overrides the Parent class method, subclass method is invoked at runtime.

Reference : http://beginnersbook.com/2013/03/polymorphism-in-java/ 

## Encapsulation

In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. There are accessible and mutable method, get and set.

These are examples
```java
//Student class
public class Student {  
  private String name;  

  public String getName() {  
    return name;  
  }  

  public void setName(String name) {  
    this.name = name;  
  }  
}  
```

```java
//Main class
class Main {  
  public static void main(String[] args) {  
    Student s = new Student();  
    s.setName("Net");  
    System.out.println(s.getName());  
  }  
}  
```
In a main class, we set name to student class and print the name out of it. It can highly be used when there are polymorphism
superclass set private modifier to the attribute and the subclass cannot access so it use the encapsulation principle to access the 
attribute by create get and set.

Reference : http://www.javatpoint.com/encapsulation

## Exercise

[Polymorphism and Encapsulation][1]

[1]:https://github.com/narutp/codeguide/tree/master/src/Exercise.java
