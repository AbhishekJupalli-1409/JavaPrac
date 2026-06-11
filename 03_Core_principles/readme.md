## Core Principles
### Encapsulation - (data hiding)
#### 1) What is Encapsulation?
Nothing but data hiding , data that you bind should be private hidden from outside world, can see it by getter and setter fucntions
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
}
```
#### 2) Why is it important? (security, maintainability, modular)
people cannot change ur data until they have permissions
```java
BankAccount obj = new BankAccount("Raj",1000);// if new logic comes 1% money is taken by bank for maintaining.
obj.withdraw(1);// now all the bank in the world has to do this instead if you change in method function
//you dont need to change it any where else !!! this is maintainability


BankAccount obj = new BankAccount("Raj",1000);
obj.addMoney(1000)
);
```

### Access Specifiers
#### 1) What are access specifiers?
It is something which controls the visibitlity of class, methods, and variables.
#### 2) Purpose of Acess specifiers? (Enforce Encapsulation, Controlled access)
whom to give acess private only with in the class, public all world outside
#### 3) Types of encapsulation of each type
1) private (Private variable -> Inside the class, private methods -> other methods can call it, Private class -> this throws the error because the class can only be access inside the package means same folder by default its package-protected, but if you give it private package cannot use use it and throws error). But if a class is inside a class then yo u can make it private
```java
class ABC{
    private class XYZ{
        XYX(){
            print("test");
        }

    }
    public void update(){
        XYZ obj = new XYZ();// can do this private class accessible in that class
    }
} 
```
2) Public -> (public variable -> Entire world, public method -> entire world, public class entire world) If your class visiblity is limited your cannot override
```java
class Account{// by default this class is package-protected ouside of folder you can't created a object and u cant override it
    public String name
}
```
3) Protected -> visible inside the package and to the subclasses of other packages
```java
package 1
protected class ABC{
    // this can be accessed inside the package everywhere same folder.
}

package 2
protected class DEF{
    method(){
        ABC obj = new ABC(); //throws an error
    }
    // but this can be accessible using the subclass by extending it
    
}
protected class HEF extends ABC{// this is a subclass 
    method(){
        ABC obj = new ABC(); //completely works
    }
    

}
```
| Access Modifier | Class | Package | Subclass | World (Other Packages) |
| --------------- | :---: | :-----: | :------: | :--------------------: |
| Public          |   ✓   |    ✓    |     ✓    |            ✓          |
| Protected       |   ✓   |    ✓    |     ✓    |            ✗          |
| Default         |   ✓   |    ✓    |     ✗    |            ✗          |
| Private         |   ✓   |    ✗    |     ✗    |            ✗          |

#### 4) What is the default access specifier
by default the acess specifiers of methods and varibles is default and for the class is package-protected
