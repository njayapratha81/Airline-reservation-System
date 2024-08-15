import package1.Account;
import java.io.*;
import java.util.Scanner;
class ATM
{
    public static void main(String[] args )
    {
        Scanner in=new Scanner(System.in);
        int num;
        System.out.println("_DETAILS _");
        Account ob=new Account();
        ob.display();
        System.out.println("1-->withdraw\n2-->deposit\n3-->Minimum Balance");
        System.out.println("Enter your choice ");
        num=in.nextInt();
        if(num==1)
        {
            savingsAccount obj=new savingsAccount();
            obj.calc1();
        }
        else if(num==2)
        {
            currentAccount obj1=new currentAccount();
            obj1.calc2();
        }
        else if(num==3)
        {
            balance obj2=new balance();
            obj2.calc3();
        }
        
        System.out.println("...THANK YOU!please come again...");
    }
}