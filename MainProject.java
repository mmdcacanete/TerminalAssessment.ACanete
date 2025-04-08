/*
 * Aldrin Cañete
 * MO-IT101 - Computer Programming 1 A1103
 * Terminal Assessment
 *Note: I used whole numbers for timeIn and timeOut because time methods are too advanced for me.
 */

import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class MainProject{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalWorkHours = 0;
        double totalSalary = 535.71;
        double sssDeduc = .10;
        double pagIbigDeduc = .02;
        double philHealthDeduc = .05;
        double holdingTaxDeduc = .10;
        double netIncome = 0;
        double netIncomeFinale = 0;
        employeeInformation empInfo = new employeeInformation(); 

        //Employee information print from other class
        System.out.println("\n--- Employee Information ---");
        empInfo.printEmployeeInfo(); 

        // Loop for 5 working days (Monday to Friday)
        System.out.println("\n--- Employee TimeSheet---");
        System.out.println("\n--- Use whole number only--");
        for (double day = 1; day <= 5; day++) {
            System.out.println("Day " + day + ":");

            // Ask for time in
            System.out.print("Enter Time In (0-23): ");
            double timeIn = scanner.nextInt();

            // Ask for time out
            System.out.print("Enter Time Out (0-23): ");
            double timeOut = scanner.nextInt();

            // Calculate daily work hours
            double workHours;
            if (timeOut >= timeIn) {
                workHours = timeOut - timeIn;  // Same day
            } else {
                workHours = (24 - timeIn) + timeOut;  // Next day
            }

            totalWorkHours += workHours; // Add to total hours
            System.out.println("Work Hours for Day " + day + ": " + workHours + "\n");
        }

        System.out.println("Total Work Hours for the Week: " + totalWorkHours);
        scanner.close();
        //Salary computation via hourly rate
        System.out.println("\n--- Employee Salary---");
        totalSalary =  totalWorkHours * totalSalary;
        System.out.println("Total Salary for the Week: " + "P" +totalSalary);

    //Government Deductions
    System.out.println("\n--- Employee Government Deductions---");
    sssDeduc = totalSalary * sssDeduc;
    System.out.println("SSS Deduction: " + sssDeduc);

    pagIbigDeduc = totalSalary * pagIbigDeduc;
    System.out.println("Pag-Ibig Deduction: "+ pagIbigDeduc);

    philHealthDeduc = totalSalary * philHealthDeduc;
    System.out.println("PhilHealth Deduction: "+ philHealthDeduc);

    holdingTaxDeduc = totalSalary * holdingTaxDeduc;
    System.out.println("WithHolding Tax Deduction: "+ holdingTaxDeduc);
 
    //Net Income Calculation
    netIncome = netIncome + totalSalary;
    netIncomeFinale = netIncome - sssDeduc - pagIbigDeduc - philHealthDeduc - holdingTaxDeduc;
    System.out.println("\n---Net Income--");
    System.out.println("P"+ netIncomeFinale);
    

    }

}