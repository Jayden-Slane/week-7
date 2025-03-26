import java.util.*;
public class oddsum {
    public static void main (String[]args){

        int number;
        Scanner imput = new Scanner (System.in);
        System.out.print("Enter a number: ");
        number = imput.nextInt();
        int sum = 0;
        for (int i = 1; i<=number; i += 2){
            sum += i;


        }

        System.out.print(sum);

    }
    
}
