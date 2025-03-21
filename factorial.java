import java.util.*;
// Jayden Slane //
public class factorial {
    public static void main (String[]args){
        int factorial = 1;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a number :");
        int num = input.nextInt();
        
        for (int i = num; i>0; i--){
            factorial = factorial * i;
        }
    
        System.out.println("Factorial : " + factorial);

    }
    
}
