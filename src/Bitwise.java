import java.util.Scanner;

public class Bitwise {
    // check if number is even or odd using bitwise operator
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();
        int result = num & 1;
        if(result==1){
            System.out.println("Number is odd");
        }else {
            System.out.println("Number is even");
        }
    }
}
