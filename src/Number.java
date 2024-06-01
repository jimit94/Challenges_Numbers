import java.util.Scanner;

public class Number {
    // to check whether number is positive, negative or zero
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int num = input.nextInt();
        if(num>0){
            System.out.println("Your number is positive");
        } else if (num<0) {
            System.out.println("Your number is negative");
        }else {
            System.out.println("your number is zero");
        }
    }
}