public class TestCylinder { 
   public static void main(String[] args) {

      //objek c1 = default constructor
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder C1:"
         + "\nradius = " + c1.getRadius()
         + "\nheight = " + c1.getHeight()
         + "\nbase area = " + c1.getArea()
         + "\nvolume = " + c1.getVolume()
         + "\ncolor = " + c1.getColor());

      //objek c2 = constructor satu parameter
      Cylinder c2 = new Cylinder(10.0);
      System.out.println("\nCylinder C2:"
         + "\nradius = " + c2.getRadius()
         + "\nheight = " + c2.getHeight()
         + "\nbase area = " + c2.getArea()
         + "\nvolume = " + c2.getVolume()
         + "\ncolor = " + c1.getColor());

      //objek c3 = constructor dua parameter
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println("\nCylinder C3:"
         + "\nradius = " + c3.getRadius()
         + "\nheight = " + c3.getHeight()
         + "\nbase area = " + c3.getArea()
         + "\nvolume = " + c3.getVolume()
         + "\ncolor = " + c1.getColor());
      
      
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(c3.toString());
   }
}