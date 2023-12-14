import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Cylinder: ");
        System.out.print("height = ");
        double height = scanner.nextDouble();

        System.out.print("radius = ");
        double radius = scanner.nextDouble();

        System.out.print("color = ");
        String color = scanner.next();

        Cylinder c0 = new Cylinder();
        Cylinder c1 = new Cylinder(radius);
        Cylinder c2 = new Cylinder(radius, height);
        Cylinder c3 = new Cylinder(color, radius, height);

        System.out.println(c0.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println();
        scanner.close();
    }
}