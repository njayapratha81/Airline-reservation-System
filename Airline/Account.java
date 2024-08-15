package package1;
import java.util.*;
import java.io.*;
class Account
{
    Scanner in=new Scanner(System.in);
    int accno;
    String name;
    float balance=10500;
    Account() 
    {
        System.out.println("\n");
    }
    public void display()
    {
        System.out.println("****WELCOME!***");
        System.out.println("ENTER NAME            : ");
        name=in.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER  : ");
        accno=in.nextInt();
        System.out.println();
        System.out.println("**DISPLAY DETAILS**");
        System.out.println("NAME                  : "+name);
        System.out.println("ACCOUNT NUMBER        : "+accno);
       
    }
    
}
class savingsAccount  extends Account 
{
    Scanner in=new Scanner(System.in);
    int password,Withdraw_amt;
    int balance=10500;
    savingsAccount()
    {
        System.out.println("\n_WITHDRAW PROCESS_");
        System.out.println("Enter your password: ");
        password=in.nextInt();
        System.out.println("Enter withdraw amount: ");
        Withdraw_amt=in.nextInt();
        if(balance>=Withdraw_amt)
        {
        System.out.println("PLEASE COLLECT YOUR WITHDRAWAL AMOUNT "+Withdraw_amt);
        System.out.println("\n**your amount was withdrawal successfully **");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    public void calc1()
    {
        int minbal=balance-Withdraw_amt;
        System.out.println("\nminimum balance is "+minbal);
    }
}
class currentAccount extends Account 
{
    Scanner in=new Scanner(System.in);
    int password,amt,balance=10500;
    currentAccount()
    {
        System.out.println("\nDEPOSIT AMOUNT");
        System.out.println("Enter your password: ");
        password=in.nextInt();
        System.out.println("Enter deposit amount: ");
        amt=in.nextInt();
        System.out.println("please insert your deposit amount "+amt);
        System.out.println("**your amount is deposited successfully*");
    }
    public void calc2()
    {
        int minimumbal=balance+amt;
        System.out.println("minimum balance is "+minimumbal);
    }
}
class balance extends Account
{
    balance()
    {
    System.out.println("\n MINIMUM BALANCE");
    System.out.println("Minimum Balance is :"+balance);
    }
    public void calc3()
    {
        System.out.println("");
    }
}
