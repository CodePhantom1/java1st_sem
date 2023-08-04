package week4;

public class name {
    public static void main(String[] args) {
        String FullName = "Jibrael Bagheri" ;
        int index = FullName.indexOf(" ");
        String FirstName = FullName.substring(0, index);
        System.out.println(FirstName);

        String LastName = FullName.substring(index+1);
        System.out.println(LastName);
        
    }
    
}
