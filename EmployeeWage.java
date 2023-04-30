
package Bridgelabz.Employeewg;

public class EmployeeWage {
    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    public static final int Emp_RATE_PER_HR = 20;
    public static final int NUM_OF_WORKING_DAYS=20;

    public static void main(String[] args) {
        int EmpHr = 0;
        int EmpWage = 0;
        int totalEmpWage = 0;

        for (int day=0; day< NUM_OF_WORKING_DAYS;day++) {
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
            System.out.println("Employee Wage : " + EmpWage);
        }
        System.out.println("Toatal Emp Wage : " + totalEmpWage);
}

}



