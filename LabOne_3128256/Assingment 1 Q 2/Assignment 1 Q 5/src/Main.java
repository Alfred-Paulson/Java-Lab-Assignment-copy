//Alfred Paulson - 3128256
//Finding the difference between birth year and month of two people
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int TOTAL_NO_MONTHS=12,diff_months;

        System.out.println("Enter year  of birth and month (1-12): ");
        int first_year = input.nextInt();
        int first_month = input.nextInt();

        System.out.println("Enter second birth year and month: ");
        int second_year = input.nextInt();
        int second_month =  input.nextInt();

        int diff_years =second_year-first_year ;

        if (second_month < first_month) {
            diff_years--;
            diff_months = TOTAL_NO_MONTHS-( first_month - second_month);
        } else {
            diff_months = second_month - first_month;
        }

        System.out.println("The difference is "+diff_years+" years "+diff_months+" months");


    }
}