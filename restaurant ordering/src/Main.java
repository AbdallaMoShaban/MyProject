import java.util.Scanner;
//declaring once and do not declaring any time

public class Main {
    static Scanner input = new Scanner(System.in);
    static byte burger =50, pizza =80, pasta =60, cola =20;
    static byte qBurger,qPizza,qPasta, qCola;
    static double totalPrice;
    static String name;


    static void menu(){
        String[] item ={"Burger" ,"Pizza", "Pasta" ,"Cola"};
        int[] price = {50,80,60,20};
        for (String items:item){
            System.out.print(items+", ");

        }
        System.out.println(" ");
        for (int prices:price ){
            System.out.print(prices+",   ");

        }
        System.out.println(" ");
        System.out.println("Enter your Name");
         name =input.nextLine();
    }
    static void choose(){

        //--------------------------
        System.out.println("You want Burger (y/n)");
        char B =input.next().charAt(0);
        if (B=='y')
        {
            System.out.println("Enter the Quantity");
             qBurger = input.nextByte();
        }
        else if (B =='n')
        {
            System.out.println("As you like");
        }
        //----------------------------
        System.out.println("You want Pizza (y/n)");
        char P =input.next().charAt(0);
        if (P=='y')
        {
            System.out.println("Enter the Quantity");
             qPizza = input.nextByte();
        }
        else if (P =='n')
        {
            System.out.println("As you like");
        }
        //--------------------------------------
        System.out.println("You want Pasta (y/n)");
        char T =input.next().charAt(0);
        if (T=='y')
        {
            System.out.println("Enter the Quantity");
             qPasta = input.nextByte();
        }
        else if (T =='n')
        {
            System.out.println("As you like");
        }
        //-----------------------------------
        System.out.println("You want Cola (y/n)");
        char C =input.next().charAt(0);
        if (C=='y')
        {
            System.out.println("Enter the Quantity");
             qCola = input.nextByte();
        }
        else if (C =='n')
        {
            System.out.println("As you like");
        }




    }
    static void bill (){
        System.out.println("==============Bill=============");
        System.out.println("your name is "+name);
        totalPrice=((burger*qBurger)+(pasta*qPasta)+(pizza*qPizza)+(cola*qCola));
        System.out.println("total bill is "+totalPrice);
        if (totalPrice>=300){
            System.out.println("You have discount 15%");
            double discount = totalPrice*0.15;
            System.out.println("final bill = "+(totalPrice-discount));
        }

    }

    public static void main (String[] args){
         menu();
         choose();
          bill();
    }
}