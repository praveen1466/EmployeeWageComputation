package employeewage;

import java.util.Random;

public class EmployeeWageMethod {
	public void empWage() {
		int ratePerHour = 20;
		int empHour = 0;
		int NUM_WORKING_DAYS = 20;
		int MAX_HRS_IN_MONTH = 100;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
			totalWorkingDays++;
			totalEmpHrs++;
			Random rand = new Random();
			int empAttendance = rand.nextInt(2);
			System.out.println("Generated number for Employee is which type :" + empAttendance);

			switch (empAttendance) {
			case 0:
				System.out.println("Employee is full-time");
				empHour = 8;
				int salary = (empHour * ratePerHour);
				System.out.println("salary is :" + salary);
				break;
			case 1:
				System.out.println("Employee is part-time");
				empHour = 4;
				int salary1 = (empHour * ratePerHour);
				System.out.println("salary is :" + salary1);
				break;
			default:
				System.out.println("Employee is absent");
			}

		}
	}

	public static void main(String[] args) {
		EmployeeWageMethod emp = new EmployeeWageMethod();
		emp.empWage();
	}
}
