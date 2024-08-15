import java.util.Scanner;
class A extends Thread
{
   public void run()
   {
     int num;
     Scanner in = new Scanner(System.in);
     num = in.nextInt();
     System.out.println("The Random Number is : "+num);
     if(num%2==0)
     { 
        B bThread = new B(num);
        bThread.start();
     }
     else
     {
        C cThread = new C(num);
        cThread.start();
     }
   }
}
class B extends Thread
{
     int number;
     B(int num)
     {
       number = num;
     }
     public void run()
     {
       System.out.println("*****The given Random number is even so square of Even Number*******");
       System.out.println("The square of" +number+ "="+(number*number));
     }
}
class C extends Thread
{
      int number;
      C(int num)
      {
        number = num;
      }
      public void run()
      {
        System.out.println("******The random number is odd so cube of odd number*******");
        System.out.println("The cube of" +number+ "=" +number*number*number);
      }
}
class Threadmain
{
     public static void main(String[] args)
     {
       A aThread = new A();
       aThread.start();
     }
}
      