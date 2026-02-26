public class Shape {
    private String color;
    private boolean filled;

    //constructor tanpa parameter
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    //constructor 2 parameter color dan filled
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //getter color
    public String getColor(){
        return this.color;
    }

    //setter color
    public void setColor(String color){
        this.color = color;
    }

    //getter filled
    public boolean isFilled(){
        return this.filled;
    }

    //setter filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "Shape [ color = " + getColor() + ",filled = " + isFilled() + " ]"; 
    }
}
