import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age = 15;
        int ticketPrice = 100;
        float discount = 0.5f;
        int ageIn = input.nextInt();
        if (ageIn>=13){
            System.out.println("your ticket price is "+ ticketPrice);
        }
        else if (ageIn<=12){
            System.out.println("You have a discount 50%");
            System.out.println("Ticket price = "+ ticketPrice);
            System.out.println("your ticket after discount = "+ ticketPrice*discount);


        }
    }
}