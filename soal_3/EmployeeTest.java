package soal_3;

public class EmployeeTest {
   public static void main(String[] args) {
      // Mendeklarasikan dan mengalokasikan array untuk 3 objek Employee
      Employee[] staff = new Employee[3];

      // Inisialisasi data karyawan
      staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
      staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
      staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

      // Menaikkan gaji setiap staf sebesar 5%
      for (int i = 0; i < 3; i++) {
         staff[i].raiseSalary(5);
      }

      // Mencetak data dari setiap staf
      for (int i = 0; i < 3; i++) {
         staff[i].print();
      }

      System.out.println("Compare Gaji Karyawan");
      //banding gaji staf index 0 dan index 1
      int hasil = staff[0].compare(staff[1]);
      
      if (hasil == -1) {
         System.out.println("\nGaji " + staff[0].getName() + " lebih kecil dari gaji " + staff[1].getName());
      } else if (hasil == 1) {
         System.out.println("\nGaji " + staff[0].getName() + " lebih besar dari gaji " + staff[1].getName());
      } else {
         System.out.println("\nGaji " + staff[0].getName() + " sama dengan gaji " + staff[1].getName());
      }
   }
}