public class Circle { 
   //attribute
   private double radius;
   private String color;

   //constructor default
   public Circle() {
      radius = 1.0;
      color = "red";
   }

   //constructor kedua
   public Circle(double radius) { 
      this.radius = radius;
      color = "red";
   }

   //constructor ketiga
   public Circle(double radius,String color){
      this.radius = radius;
      this.color = color;
   }

   //getter radius
   public double getRadius() {
      return radius;
   }

   //getter luas lingkaran
   public double getArea() {
      return radius * radius * Math.PI;
   }

   //getter color
   public String getColor(){
      return color;
   }

   //setter color
   public void setColor(String color){
      this.color = color;
   }
   
   //output text
   public String toString() {
      return "Circle[radius=" + radius + " color=" + color + "]";
   }
}