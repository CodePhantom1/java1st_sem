package week5.week6;

public class hello {
    public static void main(String[] args) {

        int i=2;
        int j=5;
        int k=max(i,j);
        System.out.println("the max of " + i + " and " + j + " is " + k) ;

        int m=2;
        int z=5;
        int l=min(m,z);
        System.out.println("the min of " + m + " and " + z + " is " + l) ;


             
    }

    public static int max(int num1, int num2) {

        int result;
        if(num1 > num2){
            result= num1;
        }
        else{
            result = num2;
        }
        return result;

        
    }
    public static int min (int num1 , int num2 ) {

        int result;
        if(num1 < num2){
            result= num1;
        }
        else{
            result = num2;
        }
        return result;

        
    }
}
