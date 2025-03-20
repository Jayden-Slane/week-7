import java.util.*;
public class investment {
    public static void main (String[]args){

        double investment;
        int wanted;

Scanner input = new Scanner(System.in);
System.out.print("Enter your investment: ");
investment = input.nextDouble();
System.out.print("Enter how much you want to make: ");
wanted = input.nextInt();
int yearcounter;
yearcounter = 0;
do{
    investment = investment + investment*0.075;
    yearcounter = yearcounter + 1;
}while (investment <= wanted);

System.out.print("It will take you " + yearcounter + " years to make " + wanted);

    }
}
