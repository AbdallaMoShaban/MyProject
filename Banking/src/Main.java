import java.util.Scanner;

  public class Main {

    static Scanner input = new Scanner(System.in);
    static int Balance = 10000; // we use static to make the methods use it as global

    static void checkBalance()
    {System.out.println("Your Balance is " +Balance );}


    static void deposit()
    {
        System.out.println("What is the amount you would to deposit");
        int deposit = input.nextInt();
        System.out.println("thank you for using bank now your balance is "+(deposit+Balance));
        System.out.println("now your balance is "+(deposit+Balance));

    }

    static void withDraw()
    {
        System.out.println("What is the amount you would to withdraw");
        int withdraw = input.nextInt();
        if (withdraw<=Balance)
        {
        System.out.println("thank you for using bank now your balance is "+(Balance-withdraw));
        System.out.println("now your balance is "+(Balance-withdraw));}
        else
        {
            System.out.println("Insufficient Balance");
        }
    }


    static void transfer()
    {
        System.out.println("What is the amount you would to transfer");
        int transfer = input.nextInt();
        if (transfer<=Balance)
        {
            System.out.println("thank you for using bank now your balance is "+(Balance-transfer));
            System.out.println("now your balance is "+(Balance-transfer));
        }
        else
        {
            System.out.println("Insufficient Balance");
        }

    }



    public static void main(String []args){
        System.out.println("we have 4 services ");
        System.out.println("to check balance press 1");
        System.out.println("to deposit press 2");
        System.out.println("to withdraw  press 3");
        System.out.println("to transfer  press 4");
        byte press =input.nextByte();

    switch (press)
    {
        case 1:
            checkBalance();


            break;
        case 2:
            deposit();


            break;

        case 3:
            withDraw();


            break;

        case 4:
            transfer();


            break;

        default:
            System.out.println("Thank you for using bank");

    }

  }

}
