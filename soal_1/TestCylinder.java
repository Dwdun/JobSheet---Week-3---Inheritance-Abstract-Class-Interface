public class TestCylinder { 
   public static void main(String[] args) {

      //objek c1 = default constructor
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder C1:"
         + "\nJari-Jari = " + c1.getRadius()
         + "\nTinggi = " + c1.getHeight()
         + "\nLuas Permukaan = " + c1.getArea()
         + "\nVolume = " + c1.getVolume()
         + "\nWarna = " + c1.getColor());

      //objek c2 = constructor satu parameter
      Cylinder c2 = new Cylinder(10.0);
      System.out.println("\nCylinder C2:"
        + "\nJari-Jari = " + c2.getRadius()
         + "\nTinggi = " + c2.getHeight()
         + "\nLuas Permukaan = " + c2.getArea()
         + "\nVolume = " + c2.getVolume()
         + "\nWarna = " + c2.getColor());

      //objek c3 = constructor dua parameter
      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println("\nCylinder C3:"
         + "\nJari-Jari = " + c3.getRadius()
         + "\nTinggi = " + c3.getHeight()
         + "\nLuas Permukaan = " + c3.getArea()
         + "\nVolume = " + c3.getVolume()
         + "\nWarna = " + c3.getColor());
      
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(c3.toString());
   }
}