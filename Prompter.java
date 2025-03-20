import java.util.*;
public class Prompter {
    public static void main (String[]args){

        int min;
        int max;
        int number;


Scanner input = new Scanner(System.in);
System.out.print("Enter max: ");
max = input.nextInt();
System.out.print("Enter min: ");
min = input.nextInt();

do{
    System.out.print("Enter a number between " + min + " and " +max + ": ");
    number = input.nextInt();
}while((number <= min)||(number >=max));


    }
    
}
