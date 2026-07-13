import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);

        String [] products = {"T-Shirts","Shoes","Hats"};
        int [] price = {2000,1500,6000};

        for (int i =0; i < products.length;i++)
        {
            System.out.print(products[i]+" ");
        }
        System.out.println("\n");
        for (int j =0 ; j< products.length;j++)
        {
                System.out.print(price[j]+" ");
        }

        System.out.println("\n");
        System.out.println("enter number of T-Shirt");
        byte tShirt = input.nextByte();
        System.out.println("enter number of Shoes");
        byte shoes = input.nextByte();
        System.out.println("enter number of Hats");
        byte hats = input.nextByte();
        double totalPrice = (tShirt*price[0]+shoes*price[1]+hats*price[0]);

        if (totalPrice>=6000)
        {
            System.out.println("you have discount 20% ");
            float discount =0.2f;
            double priceAfterDiscount=(totalPrice*discount);

            System.out.println("the discount is " + (totalPrice-priceAfterDiscount));
            System.out.println("your bill before discount = " +totalPrice);
            System.out.println("your bill after discount = " +priceAfterDiscount);
        }

        else if (totalPrice>=3000)
        {
            System.out.println("you have discount 10% ");
            float discount =0.1f;
            double priceAfterDiscount=(totalPrice*discount);

            System.out.println("the discount is " + (totalPrice-priceAfterDiscount));
            System.out.println("your bill before discount = " +totalPrice);
            System.out.println("your bill after discount = " +priceAfterDiscount);
        }

        else
        {
            System.out.println("no discount ");
            System.out.println("your bill is "+ totalPrice);
        }

        System.out.println("Thank you");

    }
}