import java.util.*;
public class Numsum {
    public static void main (String[]args){

int number;
int counter = 1;
int sum = 0;
Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
number = input.nextInt();

while(counter <= number){

    System.out.println(counter);
sum+=counter;
counter++;

}
System.out.println("The sum of all of these numbers is : " + sum);
    }
}