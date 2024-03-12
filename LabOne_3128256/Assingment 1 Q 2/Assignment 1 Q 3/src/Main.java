//Alfred Paulson - 3128256
//Made a calculator for paint requirements for walls
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter your wall width in meters: ");
        int width =  input.nextInt();

        System.out.print("Enter your walls height in meters: ");
        int height = input.nextInt();
        double area = width*height;

        System.out.println("The wall is:"+area);
        double paint_needed_for_one_sq = 2.5*13;

        double total_cans = Math.ceil(area/paint_needed_for_one_sq);
        System.out.println("You will need "+total_cans+" tins of paint");





    }
}