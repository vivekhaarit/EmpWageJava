public class EmpWage{
	//constants
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int MAX_HRS_IN_MONTH=100;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int NO_OF_WORKING_DAYS=20;
	
	public static void main(String[] args){
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int empHrs=0;
		int empWage=0;
		while(totalEmpHrs<=MAX_HRS_IN_MONTH && 
			totalWorkingDays<NO_OF_WORKING_DAYS)
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
			totalWorkingDays++;
			totalEmpHrs += empHrs;
		
			empWage=empHrs*EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("today's wage: "+empWage);
		}
		System.out.println("Total monthly wage: "+totalEmpWage);	
	}
}
