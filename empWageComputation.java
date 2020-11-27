import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
	
   int empHrs;
   int salary;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   
   Random rand=new Random();
   int empAttendance=rand.nextInt(3);
   System.out.println("Staus of Employee Whether Employee is present or absent:"+empAttendance);
   switch (empAttendance) {
   case 1:
           empHrs=4;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   case 2:
           empHrs=8;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
   default:
           empHrs=0;
           System.out.println("Employee hours: "+empHrs);
           salary=(empHrs*EMP_RATE_PER_HR);
           System.out.println("Salary: "+salary);
           break;
    }
  }
}
