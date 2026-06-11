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