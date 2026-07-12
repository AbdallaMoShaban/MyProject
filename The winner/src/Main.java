import java.util.Scanner;

public class Main{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println(" Enter RealMadrid Goals");
            byte realMadrid = input.nextByte();
    System.out.println(" Enter barcelona Goals");
            byte barcelona  = input.nextByte();

    if (realMadrid>barcelona)
    {
        System.out.println("the winner is Real Madrid ");
        System.out.println("Score "+realMadrid+":"+barcelona);
    }
    else
    {
        System.out.println("the winner is Barcelona ");
        System.out.println("Score "+barcelona+":"+realMadrid);
    }

    }
}