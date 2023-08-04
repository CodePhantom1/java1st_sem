import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to ennter three numbers

        System.out.println("enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        input.close();

        //compute average
        double average = (number1 + number2 + number3)/3;

        //results
        
        System.out.println("the avergae of " + number1 + " " + number2 + " " + number3 + " is " + average);


    
    }
    
}
