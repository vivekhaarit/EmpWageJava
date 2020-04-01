public class EmpWage{
	//constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2; 

	public static int employeeWage(String companyName,int no_of_working_days,
					int max_hrs_in_month,int emp_rate_per_hr){
		
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int empWage=0;
		int empHrs=0;

		while(totalEmpHrs<=max_hrs_in_month && 
			totalWorkingDays < no_of_working_days)
		{
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch (empCheck){
				case IS_FULL_TIME:
					empHrs=8;
					System.out.println("worked full time");
					break;
				case IS_PART_TIME:
					empHrs=4;
					System.out.println("worked part time");
					break;
				default:
					System.out.println("didn't work");
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			empWage=empHrs*emp_rate_per_hr;
			totalWorkingDays++;
		
			System.out.println("today's wage at "+companyName+" : "+empWage);
		}

		totalEmpWage=totalEmpHrs*emp_rate_per_hr;
		return totalEmpWage;
	}
	
	public static void main(String[] args){
		
		int monthlyWage=employeeWage("bridgelabz",30,120,20);
		System.out.println("Total monthly wage: "+monthlyWage);	
	}
}
