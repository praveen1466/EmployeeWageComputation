import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   int isPresent=1;
   int salary;
   Random rand=new Random();
   int empAttendance=rand.nextInt(2);
   System.out.println("Staus of Employee Whether Employee is present or absent:"+empAttendance);
   if(empAttendance == isPresent) {

        System.out.println("Employee is present...");
        int empHrs=8;
        int ratePerHour=20;
        salary=empHrs * ratePerHour;
   }
   else {

        System.out.println("Employee is absent...");
        salary=0;
   }
  System.out.println("Salary of Employee: "+salary);
  }
}
