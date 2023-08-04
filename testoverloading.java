package week5.week6;

public class testoverloading {
    public static void main(String[] args) {
        System.out.println("the maximum of two integers is " + max(5,6));

        System.out.println("the max of two doubles is " + max(5.0,6.2));

        System.out.println("the max of three numbers is " + max(5.1,6.2,8.3));
        
    }
    public static int max(int num1 , int num2) {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }

        
    }
    public static double max(double num1 , double num2) {
        if(num1>num2){
            return num1;
        }
        else{
            return num2;
        }  
    }
    public static double max(double num1,double num2,double num3){

        return max(max(num1,num2),num3);
    }
}    
