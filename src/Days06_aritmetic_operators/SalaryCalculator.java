package Days06_aritmetic_operators;

public class SalaryCalculator {
    public static void main(String[] args) {

        /*
        salary, stateTaxRate, federalTaxRate, stateTax, federalTax,totalTax, salaryAfterTax
         */


        double salary = 100000;
        double stateTaxRate = 0.08;
        double federalTaxRate = 0.21;
        double statetax = salary * stateTaxRate;
        double federaltax = salary * stateTaxRate;
        double totaltax= statetax + federaltax;
        double salaryAfterTax = salary -totaltax;

        System.out.println();
        System.out.println("State Tax rate is:" +(stateTaxRate*100)+ "%");



        System.out.println("Total salary is $" + salary);
        System.out.println("State tax $" + statetax);
        System.out.println("Federal tax $" + federaltax);
        System.out.println("Total tax amount paid $" + totaltax);
        System.out.println("TOTAL SALARY PAID AFTER TAXES $" + salaryAfterTax);













    }
}
