//inheritence (subclass dari circle)
public class Cylinder extends Circle { 
   //attribute
   private double height; 

   //cosntructor default
   public Cylinder() {
      //memanggil constructor superclass
      super(); 
      this.height = 1.0;
   }

   //constructor kedua
   public Cylinder(double height) {
      super();
      this.height = height;
   }

   //constructor ketiga
   public Cylinder(double radius, double height) {
      super(radius);
      this.height = height;
   }

   //getter height
   public double getHeight() {
      return height;
   }

   //luas permukaan tabung
   @Override
   public double getArea() {
      return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
   }

   //getter volume tabung
   public double getVolume() {
      return super.getArea() * height;
   }

   //output
   @Override
   public String toString() { 
      return "Cylinder subclass dari " + super.toString() + " height = " + height;
   }
}