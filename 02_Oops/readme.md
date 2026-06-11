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
we use concept of class multiple times using objects.

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
### Java Stack vs Heap Memory..
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


### Type declarations Image 
---

[TypeDeaclarations Image](typeDecalrations.png)

> TODO: create a Student class attributes name(String) rollNumber(int) methods setDetails(String name,int rollNumber), displayDetails() 


### Attributes and Methods
#### 1) What are attributes and methods?
1) Attributes variables that store the data(these shouldn't be exposed to outer world(private)) 
2) Functions in a class are called as the methods if the name is same as class then it is called default constructor.

#### 2) How attributes and methods work together?
Instead of people acess the sensitive data rather give me public function which they can use, keep the attributes private , create setter and getter methods.

#### 3) Key points for starters (accessing, encapsulation, default values, error handling)?
Please be very careful of the data which you expose outside it should be encapsulated(most of cases we use private),
*Maintain correct error logs and the print statements so that when somethings went wrong its easy to debug*

#### 4) Implement a Bank Account class keeping all things in mind.
```java
class BankAccount{
    private String name;
    private double balance;
    BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public string getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    // giving default values in a class in user doesn't input so does the code wont break
    BankAccount(){
        name = "";
        balance = 0.00;
    }
    // use correct error handling
    public void addMoney(double amount){
        if(amount>0) balance += amount;
        else System.out.println("amount shouldn't be a negative value");
    }
    public boolean withdrawMoney(double amount){
        if(amount>=balance){
            balance -= amount;
            return true;
        }
        System.out.println("your balance is low");
        return false;
    }
}
```

> TODO: Design a BankAccount class
> Attributes accountNumber(string), balance(double)
> Constructor parameterised with accountNumber a balance initialised
> Methods deposit(double amount)-> it adds the money to the users account, withdraw(double amount)-> deducts the money if insufficient print "Insufficient Funds", displayDetails()-> displays the accountnumber and balance of the account

```java 
class BankAccount{
    private String accountNumber;
    private double balance;
    BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

        }
        public void deposit(double amount){
            balance += amount;
        }
        public void withdraw(double amount){
            if(balance>=amount) balance -= amount;
            else System.out.println("Insufficient funds!");
        }
        public void displayDetails(){
            System.out.println("Account Number : " + accountNumber);
            System.out.println( "Balance : " + balance);
        }

```

### Constructor

#### 1) key Features
If there is name method of same name as in the class name, when we are creating an object it creates the default constructor and calls it. Constructor in the java doesn't have any return types not even void
#### 2) Purpose of a constructor
1) creating an object instances.
2) Reusing the codes
```java 
class Account{
    String name
    int balance;
    Account(){
        balance = 1000;// set default balance is called when object is created
    }
    getBalance(){
        return balance;
    }
}
```
#### 3) Types of a constructor
1) Non parameterised constructor
2) Parameterised constructor
3) Copy constructor
parameterised constructor is giving parameters to constructor as same name as the class;
#### 4) Can a constructor call another constructor
```java 
class Account{
    String name
    int balance;
    Account(name,balance){
        this.name = name;
        this.balance = balance;
    }
    Account(name){// this is called overloading of a constructor, in case i need to open with one paramenter
        this.name = name;
    }
    Account(balance){
        this.balance = balance;
    }
    Account(Account account){// passing account object as the parameter
        Account(account.getName(),account.getBalance());
        // using the params contructor but sending values from differnent objects of same type
        // this is called as the copy constructor
        
    }
    getName(){
        return name;
    }
    getBalance(){
        return balance;
    }
}

main(){
    Account obj = new Account("ABhishek",10000);//-> default Parameterised constructor
    Account obj2 = new Account()// After creating a parameterised constructor if you call the default constructor then this will throw an error.
    // and the above data is stored in the heap memory.
}
```
yes we can call one constructor from another as you have seen in the copy constructor

#### 5) Can a constructor be overloaded
In a class if the same methods having different parameters then it is called as overloading, if it is done on the default constructor then it is called constructor overloading. You can't have same methods having same parameters then you will get the error..
