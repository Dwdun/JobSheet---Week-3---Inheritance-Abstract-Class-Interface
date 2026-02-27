public class TestShape {
    public static void main(String[] args) {
        
        //test constructor 1 class shape yang tidak memiliki parameter
         System.out.println("\nKelas Shape");
        Shape shape1 = new Shape();
        System.out.println("Shape1 : " + shape1.toString());
        
        //test constructor 2 class shape custom color dan fillednya
        Shape shape2 = new Shape("brown", false);
        System.out.println("Shape2  : " + shape2.toString());
        //tes update
        shape2.setColor("yellow");
        shape2.setFilled(true);
        System.out.println("Shape2 update : " + shape2.toString());

        //test constructor 3 class circle custom radius,color dan filled (inheritence shape)
        System.out.println("\nKelas Circle");
        Circle circle1 = new Circle(6.0, "pink", true);
        System.out.println(circle1.toString());
        System.out.println("Jari-Jari    : " + circle1.getRadius());
        System.out.println("Luas      : " + circle1.getArea());
        System.out.println("Keliling : " + circle1.getPerimeter());

        //test constructor 3 class rectangle custom width,length,color dan filled (inheritence shape)
        System.out.println("\nKelas Rectangle");
        Rectangle rectangle1 = new Rectangle(3.0, 6.0, "blue", false);
        System.out.println(rectangle1.toString());
        System.out.println("Lebar     : " + rectangle1.getWidth());
        System.out.println("Panjang    : " + rectangle1.getLength());
        System.out.println("Luas     : " + rectangle1.getArea());
        System.out.println("Keliling : " + rectangle1.getPerimeter());

        //test constructor 3 class Square custom side,color dan filled (inheritence rectangle)
        System.out.println("\nKelas Square");
        Square sq1 = new Square(3.0, "cyan", true);
        System.out.println(sq1.toString());
        System.out.println("Sisi      : " + sq1.getSide());
        System.out.println("Luas      : " + sq1.getArea()); 
        System.out.println("Keliling : " + sq1.getPerimeter());
        //test method square jika length/width diubah (keduanya harus sama)
        System.out.println("Tes update sisi Square");
        //ubah width nya
        sq1.setWidth(5.0);
        System.out.println("setelah diupdate width nya : ");
        System.out.println(sq1.toString());
        System.out.println("Luas Update : " + sq1.getArea()); 
    }
}