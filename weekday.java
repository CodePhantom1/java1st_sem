package week4;
import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the day number");
        int day = input.nextInt();

        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("weekday"); break;
            case 6:
            case 7: System.out.println("weekend"); break;           

        }

    }
    
}
