//Alfred Paulson - 3128256
//Made a calculator for calculating Area and Volume of a sphere
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the diameter  in cm : ");
        double diameter =  input.nextDouble();
        double radius = diameter/2;

        double volume = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        String rounding_volume = String.format("%.1f",volume);
        System.out.println("The volume of the ball is :"+rounding_volume+"cm Cubed");

        double surface_area =  4.0*Math.PI*Math.pow(radius,2);
        String rounding_surface = String.format("%.2f",surface_area);
        System.out.println("The surface area of the sphere is : "+rounding_surface+"cm Squared");


        }
    }