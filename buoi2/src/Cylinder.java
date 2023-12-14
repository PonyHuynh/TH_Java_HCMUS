public class Cylinder extends  Circle{
    private double  height = 1.0;

    public Cylinder() {
    }
    public Cylinder(double radius){
        this.radius = radius;
    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    public Cylinder(String color, double radius, double height) {
        this.color = color;
        this.radius = radius;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void getHeight(double height) {
        this.height = height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return this.radius * this.height * 2*Math.PI;
    }
    public String toString() {
        return "Cylinder[radius= " + this.radius + ",color= " + this.color +",height= " + this.height+",volume= "+this.getVolume()+ "]";
    }


}
