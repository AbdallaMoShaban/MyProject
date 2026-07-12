import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Balance = 3000;
        int withDraw =input.nextInt();

        if (withDraw <= Balance)
        {
            System.out.println("Transaction Successful");
            System.out.println("Now your Balance = "+(Balance-withDraw) );
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
}