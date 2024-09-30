import java.util.*;
import java.util.SplittableRandom;
class Atmproject{
    Scanner scanner=new Scanner(System.in);
    int password;
    int withdraw;
    private int pin=1234;
    private double balance=10000;
    int getpin()
    {
        return pin;
    }
    void setpin(int pin)
    {
        this.pin=pin;
        System.out.println("-------WELCOME TO ATM---------   ");
        System.out.println("enter the pin number:");
        int password=scanner.nextInt();
        if(password==pin)
        {
            System.out.println("pin entered successfully");
            System.out.print("press 1 to continue:");
            int one=scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter the name:");
            String name=scanner.nextLine();
            System.out.println("1.withdraw  2.deposit   3.balance enquiry 4.change pin number  5.exit");
            System.out.println("enter the option:");
            int opt=scanner.nextInt();
            switch(opt)
            {
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    showbalance();
                    break;
                case 4:
                     changepin();
                    break;
                case 5:
                    System.out.println("welcome");
                    break;
                default:
                    System.out.println("enter the correct option");
                    break;
                
            }
        }
        else
        {
             System.out.println("invalid pin number");
        }
    }
    void withdraw(){
        System.out.println("enter the amount to withdraw:");
        int withdraw=scanner.nextInt();
        if(withdraw<balance)
        {
            double withdrawbalance=balance-withdraw;
            System.out.println("the balance is " +withdrawbalance);
        }
        else
        {
             System.out.println("insufficient amount try again");
        }
    }
    void deposit()
    {
         System.out.println("enter the amount to deposit:");
         int depbalance=scanner.nextInt();
         double depositbalance=balance+depbalance;
         System.out.println("the balance is" +depositbalance);
    }
    void showbalance(){
        System.out.println("the balance is "+balance);
    }
    int  changepin( )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the new pin:");
        int newpin1=scan.nextInt(); 
        System.out.println("reenter the new pin :");
        int newpin2=scan.nextInt(); 
        System.out.println("enter the otp sent:");
        System.out.println("pin changed to: " +newpin1);
        return 1;
    }
    void terminate(){
       System.out.println("welcome");
    }
}
public class Atm{
    public static void main(String args[])
    {
        Atmproject obj=new Atmproject();
        obj.setpin(1111);/*can set any pin*/
        System.out.println(Atm.generateotp(5));
    }
        public static String generateotp(int otplength)
        {
            SplittableRandom split=new SplittableRandom();
            StringBuilder sb=new  StringBuilder();
            for(int i=0;i<otplength;i++)
            {
                sb.append(split.nextInt(0,10));
                
            }
            System.out.print("random user code:");
           return sb.toString();
            
        }
    
}
