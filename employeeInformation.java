
import java.time.LocalDate;

public class employeeInformation {
   

    // Declaration and Initialization
        String employeeName = "Manuel Garcia III";
        int employeeNumber = 10001;  
        LocalDate birthday = LocalDate.of(1983, 11, 10);
        String address = "Valero Carpark Building Valero Street 1227 Makati City";
        String phone = "966-860-270";
        String sss = "44-4506057-3";
        String philHealth = "820126853951";
        String tin = "442-605-657-000";
        String pagIbig = "691295330870";
        String status = "Regular", position ="Chief Executive Officer";
        String Basic = "90,000", riceSubsidy="1,500", phoneAllowance="2,000", clothingAllowance="1,000", grossMonthly="45,000", hourly="535.71";

    
    
    public void printEmployeeInfo() {
         //Print the value
         System.out.println("Employee Name: " + employeeName);
         System.out.println("Employee Number: " + employeeNumber);
         System.out.println("Birthday: " + birthday);
         System.out.println("Address: " + address);
         System.out.println("Phone: " + phone);
         System.out.println("SSS: " + sss);
         System.out.println("PhilHealth: " + philHealth);
         System.out.println("TIN: " + tin);
         System.out.println("Pag-Ibig: " + pagIbig);
         System.out.println("Status: " + status);
         System.out.println("Position: " + position);
         System.out.println("Basic Salary: " + Basic);
         System.out.println("Rice Subsidy: " + riceSubsidy);
         System.out.println("Phone Allowance: " + phoneAllowance);
         System.out.println("Clothing Allowance: " + clothingAllowance);
         System.out.println("Gross Monthly Salary: " + grossMonthly);
         System.out.println("Hourly Rate: " + hourly);
    }
}