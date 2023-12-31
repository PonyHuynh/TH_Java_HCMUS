public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle - Radius: " + circle.radius);
        System.out.println("Circle - Perimeter: " + circle.getPerimeter());
        System.out.println("Circle - Area: " + circle.getArea());

        ResizableCircle resizableCircle = new ResizableCircle(7.0);
        System.out.println("\nResizableCircle - Radius before resizing: " + resizableCircle.radius);
        System.out.println("ResizableCircle - Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ResizableCircle - Area: " + resizableCircle.getArea());

        System.out.println();

        int resizePercent = 40;
        double resizedRadius = resizableCircle.resize(resizePercent);
        resizableCircle = new ResizableCircle(resizedRadius);
        System.out.println("ResizableCircle - Radius after resizing by " + resizePercent + "%: " + resizedRadius);

        System.out.println("ResizableCircle - Perimeter: " + resizableCircle.getPerimeter());
        System.out.println("ResizableCircle - Area: " + resizableCircle.getArea());
    }
}