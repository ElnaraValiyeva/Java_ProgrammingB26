package day07;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 100_000;
        double stateTaxRate = 0.08; //8%
        double federalTaxRate =0.21; //21%
        double stateTax, federalTax, totalTax, salaryTax, salaryAfterTax;

        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;

        String taxReport = "State tax rate: " + stateTaxRate + ", Federal tax rate: " + federalTax +", salary: $" + salary + "\nTax amounts: " + stateTax + " for state tax and " + federalTax +"for a total of " +totalTax + "\nAfter tax your salary is" + salaryAfterTax;

        System.out.println(taxReport);

    }
}
