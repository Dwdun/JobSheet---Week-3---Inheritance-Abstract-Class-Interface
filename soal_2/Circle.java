public class Circle extends Shape {
    private double radius;

    public Circle(){
        this.radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    //keliling lingkaran
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString(){
        return "Circle [" + super.toString() + ", radius = " + getRadius() + "]"; 
    }
}
