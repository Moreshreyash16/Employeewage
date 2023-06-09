
package Bridgelabz.Employeewg;

public class EmployeeWage {

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int Emp_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS=20;
    public static final int MAX_HR_IN_MONTH=100;

    public  void computeWage() {
        int EmpHr = 0;
        int day=1;
        int Total_Emp_Hr=0;
        int EmpWage = 0;
        int totalEmpWage = 0;

        while (day <= NUM_OF_WORKING_DAYS && EmpHr < MAX_HR_IN_MONTH)
        {

            int empcheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empcheck) {
                case PART_TIME:
                    EmpHr = 4;
                    break;

                case FULL_TIME:
                    EmpHr = 8;
                    break;

                default:
                    EmpHr = 0;


            }
            EmpWage = EmpHr * Emp_RATE_PER_HR;
            totalEmpWage += EmpWage;
            Total_Emp_Hr += EmpHr;

            System.out.println("Day " + day + " Employee Wage : " + EmpWage + "    Total Working Hr : " + Total_Emp_Hr);

            day++;
        }
        System.out.println("Toatal Emp Wage : " + totalEmpWage);
    }

    public static void main(String[] args) {
        EmployeeWage cw=new EmployeeWage();
        cw.computeWage();
    }
}


