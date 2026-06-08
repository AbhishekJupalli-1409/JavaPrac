public class oops {
    public static void main(String[] args) {
        // TODO create a Student class attributes name(String) rollNumber(int) methods setDetails(String name,int rollNumber), displayDetails() 
        class Student{
            String name;
            int rollNumber;
            public void setDetails(String name,int rollNumber){
                this.name = name;
                this.rollNumber = rollNumber;
            }
            public void displayDetails(){
                System.out.println(name);
                System.out.println(rollNumber);
            }

        }
        Student obj1 = new Student();
        obj1.setDetails("Abhishek", 20105022);
        obj1.displayDetails();
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

    }
}
