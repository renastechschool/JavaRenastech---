package day25_Inheritance;

public class c2_CapitalOneObjects {

    public static void main(String[] args) {
        ///main goal is to create customers for capital one

        c1_BankAccountCapital accont1=new c1_BankAccountCapital("Ozge","Karabulut");

        System.out.println(accont1.firstName);
        //accont1.accountHolder priavate variable no access
        //accont1.balance
        //encapsulation
        System.out.println("accont1.getBalance() = " + accont1.getBalance());
        System.out.println("accont1.getAccountHolder() = " + accont1.getAccountHolder());
        accont1.setBalance(250);
        System.out.println("accont1.getBalance() = " + accont1.getBalance());

        accont1.deposit(340);
        System.out.println("accont1.getBalance() = " + accont1.getBalance());

        accont1.withdraw(50);
        System.out.println("accont1.getBalance() = " + accont1.getBalance());

        accont1.withdraw(100);
        System.out.println("accont1.getBalance() = " + accont1.getBalance());

        accont1.avaliableBalance();

        accont1.setAccountNumber(234234234234l);
        System.out.println("accont1.getAccountNumber() = " + accont1.getAccountNumber());

        System.out.println(accont1);

        c1_BankAccountCapital obj2=new c1_BankAccountCapital("bahast","abdulla");
        obj2.avaliableBalance();
        System.out.println(obj2);


    }
}
