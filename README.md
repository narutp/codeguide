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

[Exercises][1]

[1]:https://github.com/narutp/codeguide/tree/master/src/Exercise.java

Reference : http://beginnersbook.com/2013/03/polymorphism-in-java/ 
