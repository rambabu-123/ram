package ram;
import java.util.Scanner;

public class Area
{
    public double area(double base, double height) {
        double a = base * height;
        return a;
    }
    
    public double area(double c, double d1, double d2) {
        double a = c * d1 * d2;
        return a;
    }
    
    public double area(double c, double a, double b, double h) {
        double x = c * (a + b) * h;
        return x;
    }
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Area obj = new Area();
        
        System.out.print("Enter base of parallelogram: ");
        double base = in.nextDouble();
        System.out.print("Enter height of parallelogram: ");
        double ht = in.nextDouble();
        System.out.println("Area of parallelogram = " + obj.area(base, ht));
        
        System.out.print("Enter first diagonal of rhombus: ");
        double d1 = in.nextDouble();
        System.out.print("Enter second diagonal of rhombus: ");
        double d2 = in.nextDouble();
        System.out.println("Area of rhombus = " + obj.area(0.5, d1, d2));
        
        System.out.print("Enter first parallel side of trapezium: ");
        double a = in.nextDouble();
        System.out.print("Enter second parallel side of trapezium: ");
        double b = in.nextDouble();
        System.out.print("Enter height of trapezium: ");
        double h = in.nextDouble();
        System.out.println("Area of trapezium = " + obj.area(0.5, a, b, h));
    }   
}

