## Java Oops


### Introduciton to Object Oriented Programming
---
```
                    CLASS vs OBJECT

┌─────────────────────────────────┐
│           Student               │  ← Class (Blueprint)
├─────────────────────────────────┤
│ name : String                   │
│ age  : int                      │
├─────────────────────────────────┤
│ study()                         │
│ sleep()                         │
└───────────────┬─────────────────┘
                │ creates
                ▼
     ┌───────────────────────┐
     │ s1 : Student          │  ← Object #1
     ├───────────────────────┤
     │ name = "Abhi"         │
     │ age  = 22             │
     └───────────────────────┘

                │
                ▼

     ┌───────────────────────┐
     │ s2 : Student          │  ← Object #2
     ├───────────────────────┤
     │ name = "Rahul"        │
     │ age  = 21             │
     └───────────────────────┘
```
#### 01) What is oops?
we use concept of class multiple times using objects
#### 02) Difference between the procedural and OOP?
procedural --> c language doesnt have objects code runs sequentially(variables exposed, can't reuse code) , oops --> c++, java, python have class,objects, we have Many iterations (hidden layer, can reuse code)
#### 03) Why use oops?
1) Make our code modular --> huge business logic is spilitted
2) Make our code reusalbe --> reusable function is used repeatedly
3) Make code Scalable --> 
4) Make is secure
#### 04) Real life analogy of oops?
think in a banking application both the user have been using the same code without objects the will be *upadting the same balance variable* and storing in db this causes the *Major issue*. Thats when we use the oops. And its scaleble and secure.
#### 05) Why is oops better for the Large Scale Apps?
In big MNC where there is large scale appication we should make sure nothing breaks so in that cases we use the oops concepts there

### Classes and Objects 
---
#### 01) What is a class? (Logical representation)
This the blue print of how the object will look like, in the main method by using this class we can create the objects.
```java
Employee {
    name
    salary

    setName(s){
        name = s;
    }
    setSalary(){
        salary = "";
    }
    getSalary(){
        return salary;
    }
}
```
#### 02) What is a object? (Physical Instance)
Created multiple instance of the class we can access all the method and attributes of that class using these created instances.
```java
main(){
    Employee obj1 = new Employee();// instance 1 
    obj1.setName("Ajay");
    // name = Ajay
    obj1.setSalary(3000);

    Employee obj2 = new Employee();// instance 2
    obj2.setName("Abhishek")
    // name = Abhishek
    obj2.setSalary(10000);

    // both the variable don't override each other or interfear with each other.
}
```
#### 03) What is a attributes and behaviour?
Attributes are nothing but all the variables in the class and behaviour is nothing but the internal funciton in the class
```java
// Attributes
name = "Ajay"
salary = "2000"
//Behaviour
setName(), setSalary
```
#### 04) How are objects created and destroyed in the memory?
1) Stack memory ->realtime memory which is created during the runtime, this is a temporary memory// when you use up all this memory which causes the stackoverflow.
2) Heap memory -> this memory which is in your systmem // this is very very large memory// if this is full means ur system memory is full

NOTE : *The stack memory is cleared after your program execution is finished but the hear memory remains the same even after the program execution*


In certian languages we have to manually delete it but in java there is a *garbage collector* which automatically does this work
```java
class Student {
    String name;
}

public class Main {
    public static void main(String[] args) {
        int age = 20;
        Student s(stored in stack) = new Student() (This is stored in the head);
        s.name = "Abhi";
    }
}
```
```
                    JAVA MEMORY

┌──────────────────── STACK ────────────────────┐      ┌─────────────── HEAP ────────────────┐
│                                               │      │                                     │
│ main() Frame                                  │      │  Student Object                     │
│ ┌───────────────────────────┐                 │      │  ┌─────────────────────────────┐    │
│ │ age = 20                  │                 │      │  │ name ------------------+    │    │
│ │                           │                 │      │  └─────────────────────────|───┘    │
│ │ s ---------------------+  │                 │      │                            |        │
│ └────────────────────────|──┘                 │      │                            v        │
└──────────────────────────|────────────────────┘      │                     ┌───────────┐   │
                           |                           │                     │  "Abhi"   │   │
                           +-------------------------->│                     └───────────┘   │
                                                       │                                     │
                                                       └─────────────────────────────────────┘
```

