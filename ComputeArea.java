
import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) {
        //create a scanner obj
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter a raduis
        System.out.println("enter a number for raduis:  ");

        double raduis = input.nextDouble();

        //compute area 
        double area = 3.14 * raduis * raduis;
        System.out.println("the area of radius is " + raduis + " is " + area);


    }
}
