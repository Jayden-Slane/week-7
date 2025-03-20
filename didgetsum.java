import java.util.*;
public class didgetsum {
    public static void main (String[]args){

        int number;
        int result;
        int didg;

    Scanner input = new Scanner(System.in);
System.out.print("Enter a POSITVIE number: ");
number = input.nextInt();
result = 0;
do{
    didg = number % 10;
    result = result + didg;
    number = number /10;
}while(number  != 0);

System.out.print(result);


    }
    
}
