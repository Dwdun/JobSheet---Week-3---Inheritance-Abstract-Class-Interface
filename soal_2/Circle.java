public class Circle extends Shape {
    private double radius;

    //constructor default
    public Circle(){
        this.radius = 1.0;
    }

    //cosntructor kedua (1 parameter)
    public Circle(double radius){
        this.radius = radius;
    }

    //constructor ketiga (3 parameter)
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    //getter jari-jari
    public double getRadius(){
        return this.radius;
    }

    //set jari jari
    public void setRadius(double radius){
        this.radius = radius;
    }

    //luas lingkaran
    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    //keliling lingkaran
    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    //output
    @Override
    public String toString(){
        return "A Circle with radius = " + getRadius() + "which is a subclass of" + super.toString();
    }
}
