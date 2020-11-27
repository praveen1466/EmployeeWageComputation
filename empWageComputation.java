import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

   int empHrs;
   int salary;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   int NUM_WORKING_DAYS=20;
   int totalSalary=0;

   for(int day=1;day<=NUM_WORKING_DAYS;day++ )
   {
    Random rand=new Random();
    int empAttendance=rand.nextInt(3);
    switch (empAttendance) {
    case 1:
           empHrs=4;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    case 2:
           empHrs=8;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    default:
           empHrs=0;
           salary=(empHrs*EMP_RATE_PER_HR);
           break;
    }
    totalSalary=(totalSalary+salary);
   }
   System.out.println("Total Salary: "+totalSalary); 
}
}
