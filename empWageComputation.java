import java.util.Random;
public class empWageComputation {
public static void main(String[] args) {
   System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
   Random rand=new Random();
   int attendance=rand.nextInt(2);
   System.out.println("Staus of Employee Whether Employee is present or absent:"+attendance);
   if(attendance == 1)
   System.out.println("Employee is present...");
   else
   System.out.println("Employee is absent..");
  }
}
