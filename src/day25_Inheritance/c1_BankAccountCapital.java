package day25_Inheritance;

public class c1_BankAccountCapital {


    //create custom class called BankAccount for CapitalOne bank accounts:
    //			public variables:  bankName, firstName, lastName
    //	 		private variables: accountHolder, accountNumber, balance
    //	 		encapsulate all the private data
    //	 		create a constructor that can initialize firstName and fullName
    //
    //	 		action:
    //	 				depositing
    //	 				withdrawing
    //	 				availablebalance
    //	 				toString: returns the full name and balance

    //			public variables:  bankName, firstName, lastName
    public static String bankName="CapitalOne"; //static public
    public String firstName; // instance public
    public String lastName; // instance public


    //	 		private variables: accountHolder, accountNumber, balance
    private String accountHolder;
    private long accountNumber;
    private double balance;

    //	 		create a constructor that can initialize firstName and fullName
    //constructor = access modifier + class name
    public c1_BankAccountCapital(String firstName ,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        //full name = first + last name
        this.accountHolder=firstName + " " + lastName;
    }

    //encapsulate all the private data
//    public void setAccountHolder(String firstName , String lastName){
//        //since we set account holder name in the constructor no need create setter for accountholder
//        this.accountHolder=firstName + " " + lastName;
//    }
    public String getAccountHolder(){
        return accountHolder;
    }

    // private long accountNumber; encapsulate
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    //private double balance; encapsulate
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    //action:
    //    //	 				depositing
    //    //	 				withdrawing
    //    //	 				availablebalance
    //    //	 				toString: returns the full name and balance

    //if i do deposit my balnce should be increased
    //balance is 100 and if i deposit 50 new balnce will be 150

    public void deposit(double money){//balance + money
        System.out.println("before deposit getBalance() = " + getBalance());
        System.out.println("Depositing "+ money);
        //balance = balance + money
        //balance += money;
        setBalance(balance+money);

    }

    //
    public void withdraw(double money){
        System.out.println("before withdraw getBalance() = " + getBalance());
        System.out.println("Withdraw "+ money);
        //balance = balance - money
        setBalance(balance-money);
    }

    public void avaliableBalance(){
        System.out.println("Avaliable balance is : " + getBalance() );
    }

    //toString: returns the full name and balance
    //help us to understand what object means for this class

    public String toString(){
        return "Full name is " + getAccountHolder() + "--- Balance is : " +getBalance();
    }


}
