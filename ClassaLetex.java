package week3;
import java.util.Scanner;

public class ClassaLetex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the purchase amount : ");

        double purchaseamount=input.nextDouble();

        input.close();

        double tax=purchaseamount * 0.06;

        System.out.println("Sale tax is $ "+tax);
    }
}

