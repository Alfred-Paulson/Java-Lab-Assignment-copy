//Alfred Paulson - 3128256
//Made a calculator for splitting restaurant bill_amounts and service service_charges with friends 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner  input =  new Scanner(System.in);

        System.out.print("Enter the bill amount: €");
        double bill_amount = input.nextDouble();

        System.out.print("Enter the number of  people:");
        int no_people = input.nextInt();

        System.out.print("Enter the service service charge (e.g., 15 for 15 %) : ");
        double service_perc = input.nextDouble();

        double service_charge = service_perc/100*bill_amount;
        double total = bill_amount+service_charge;
        String total_rounding = String.format("%.2f",total);
        System.out.println("Total bill including service charge:€ "+total_rounding );

        double div_bill_amount = total/no_people;
        String split_rounding = String.format("%.2f",div_bill_amount);
        System.out.println("Each person should pay:€ "+split_rounding);


    }
}