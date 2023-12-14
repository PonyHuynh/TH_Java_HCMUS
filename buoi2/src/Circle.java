public class Circle {

    public double radius = 1.0;

    public String  color = "red";

    public Circle() {
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }

    public void getRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void getColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    public String toString() {
        return "Circle[r= " + this.radius + ",c= " + this.color + "]";
    }

}
