import java.util.Scanner;
public class Example1222 {
    public static void main(String[] argv) {
        float number1;
        float number2;
        float discount;
        System.out.println("Enter the number1:");
//Reading the value
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        number1 = inputValue.nextFloat();
        System.out.println("Enter the number2:");
        number2 = inputValue.nextFloat();
        if (number1 >= number2) {
            System.out.println("The largest number is: " + number1);

        } else {
            System.out.println("The largest number is: " + number2);

        }


    }
}
