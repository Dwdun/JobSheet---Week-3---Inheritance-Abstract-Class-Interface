package soal_3;

//impor package
import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee {
   private String secretaryName;

   //cosntructor
   public Manager(String name, double salary, int hireday, int hiremonth, int hireyear) {
      super(name, salary, hireday, hiremonth, hireyear);
      secretaryName = "";
   }

   //kenaikan persentase gaji
   @Override
   public void raiseSalary(double byPercent) {
      // Menambahkan bonus 1/2% untuk setiap tahun masa kerja
      GregorianCalendar todaysDate = new GregorianCalendar();
      int currentYear = todaysDate.get(Calendar.YEAR);
      double bonus = 0.5 * (currentYear - hireYear());

      super.raiseSalary(byPercent + bonus);
   }

   public String getSecretaryName() {
      return secretaryName;
   }
}