import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   int empHrs;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   Random rand=new Random();
   int empAttendance=rand.nextInt(2);
   System.out.println("Staus of Employee Whether Employee is present or absent:"+empAttendance);
   if(empAttendance == IS_PART_TIME) {
        empHrs=4;
   }
   else if(empAttendance == IS_FULL_TIME) {
			empHrs=8;
   }
	else
			empHrs=0;

 
  int salary=empHrs * EMP_RATE_PER_HR;
  System.out.println("Salary: "+salary);
  }
}
