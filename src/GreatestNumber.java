import java.util.Scanner;

public class GreatestNumber {
    // find greatest of three numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter first number : ");
        int a = input.nextInt();
        System.out.print("Please enter second number : ");
        int b = input.nextInt();
        System.out.print("Please enter third number : ");
        int c = input.nextInt();
        if(a>b && a>c){
            System.out.println("Greatest number is : " + a);
        } else if (b>a && b>c) {
            System.out.println("Greatest number is : " + b);
        }
        else {
            System.out.println("Greatest number is : " + c);
        }
    }
}
