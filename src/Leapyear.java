import java.util.Scanner;

public class Leapyear {
    // check if given year is a leap year or not
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the year you want to check : ");
        double year = input.nextDouble();
      if(year % 400 == 0){
          System.out.println("Your year is a leap year");
      } else if (year % 4 == 0 && year % 100 != 0) {
          System.out.println("Your year is a leap year");
      }else {
          System.out.println("Not a leap year");
      }
    }
}
