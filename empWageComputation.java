import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
	System.out.println("Welcome to Employee Wage Computation Program on Master Branch");

   int empHrs;
   int IS_PART_TIME=1;
   int IS_FULL_TIME=2;
   int EMP_RATE_PER_HR=20;
   int MAX_HRS_IN_MONTH=10;
   int NUM_WORKING_DAYS=20;
   int totalEmpHrs=0;
   int totalWorkingDays=0;
   
   while( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS ) {
         totalWorkingDays++;
         
         Random random=new Random();
         int empAttendance=random.nextInt(3);
         switch (empAttendance) {
          case 1:
                 empHrs=4;
                 break;
          case 2:
                 empHrs=8;
                 break;
         default:
                 empHrs=0;
                  break;
        }
   totalEmpHrs=(totalEmpHrs + empHrs);
   System.out.println("Total Employee Hours of a Month: "+totalEmpHrs);
}
   int totalSalary=(totalEmpHrs*EMP_RATE_PER_HR);
   System.out.println("Total Salary of a Employee: "+totalSalary); 
 
  }
}
