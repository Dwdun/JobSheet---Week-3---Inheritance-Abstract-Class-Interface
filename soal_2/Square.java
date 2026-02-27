public class Square extends Rectangle{

    //constructor default
    public Square(){
        super(1.0,1.0);
    }

    //constructor kedua ( 1 parameter)
    public Square(double side){
        super(side,side);
    }

    //constructor ketiga (3 parameter)
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    //getter sisi
    public double getSide(){
        //pake sisi antara lebar/panjang (sama aja)
        return getWidth();
    }

    //setter sisi
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //setter lebar
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //setter panjang
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    //output
    @Override
    public String toString(){
        return "A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }
}
