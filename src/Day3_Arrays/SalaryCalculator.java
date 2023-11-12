package Day3_Arrays;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;

        double stateTaxRate = 6.0,
                federalTaxRate = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double  stateTax = stateTaxRate * salaryBeforeTax / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax =  stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

       // System.out.println("Gross pay is: " + salaryBeforeTax + "\n" + "Federal tax is: " + federalTax + "\n" + "State tax is" );




    }
}
