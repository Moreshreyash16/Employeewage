
package Bridgelabz.Employeewg;

public class EmployeeWage {
    public static void main(String[] args) {
        final int PART_TIME=1;
        final int FULL_TIME=2;
        final int Emp_RATE_PER_HR=20;

        int EmpHr=0;
        int EmpWage=0;
        int empcheck= (int) (Math.floor(Math.random()* 10 )% 3);

        switch(empcheck)
        {
            case PART_TIME:
                EmpHr=4;
                break;

            case FULL_TIME:
                EmpHr=8;
                break;

            default:
                EmpHr=0;
        }
        EmpWage=EmpHr*Emp_RATE_PER_HR;
        System.out.println("Employee Wage : " + EmpWage);
}
}



