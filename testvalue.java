package week5.week6;

public class testvalue {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;

        System.out.println("before invoking the swap method , num1 is " + num1 + " and num2 is " + num2);

        swap(num1,num2);

        System.out.println("after invoking the "+  num1 + " num2 is " + num2 );
    }
    private static void swap(int n1, int n2) {

        System.out.println("\tInside the swap method");

        System.out.println("\t\t Before swapping,n1 is "+n1+"and n2 is "+n2);

 

        int temp=n1;

        n1=n2;

        n2=temp;

       

        System.out.println("\t\tAfter swapping,n1 is "+n1+"and n2 is "+n2);

    }
    
}
