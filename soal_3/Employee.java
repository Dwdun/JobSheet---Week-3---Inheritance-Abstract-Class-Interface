package soal_3;

class Employee extends Sortable{
   private String name;
   private double salary;
   private int hireday;
   private int hiremonth;
   private int hireyear;

   //constructor
   public Employee(String name, double salary, int hireday, int hiremonth, int hireyear) {
      this.name = name;
      this.salary = salary;
      this.hireday = hireday;
      this.hiremonth = hiremonth;
      this.hireyear = hireyear;
   }

   // getter nama (tambahan aja)
   public String getName() {
      return name;
   }

   //fungsi output
   public void print() {
      System.out.println("\nNama:" + name + "\nGaji: " + salary + "\nTanggal Masuk: " + hireday + "/" + hiremonth + "/" + hireyear);
   }

   //fungsi kenaikan gaji
   public void raiseSalary(double byPercent) {
      salary *= 1 + byPercent / 100;
   }

   //getter hireyear
   public int hireYear() {
      return hireyear;
   }
   
   //fungsi sortable jika sudah tidak abstrak , diisi di subclass
   @Override
   public int compare(Sortable b) {
      Employee eb = (Employee) b;
      if (salary < eb.salary) return -1;
      if (salary > eb.salary) return 1;
      return 0;
   }
}