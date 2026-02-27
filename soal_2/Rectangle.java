public class Rectangle extends Shape {
    private double width;
    private double length;

    //constructor default
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    //cosntructor kedua (2 parameter)
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    //constructor ketiga ( 4 parameter )
    public Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    //getter lebar
    public double getWidth(){
        return this.width;
    }

    //setter lebar
    public void setWidth(double width){
        this.width = width;
    }

    //getter panjang
    public double getLength(){
        return this.length;
    }

    //setter panjang
    public void setLength(double length){
        this.length = length;
    }
    
    //luas permukaan segi empat
    public double getArea(){
        return width * length;
    }
    
    //keliling segi empat
    public double getPerimeter(){
        return 2 * (width + length);
    }

    //output
    @Override
    public String toString(){
        return "A Rectangle with width = " + getWidth() + " and length = " + getLength() + " which is a subclass of " + super.toString();
    }
}
