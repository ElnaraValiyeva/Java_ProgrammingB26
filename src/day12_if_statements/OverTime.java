package day12_if_statements;

public class OverTime {
    public static void main(String[] args) {
        /*
        create a double variable for your hourly rate
        create a double variable for the number of hours worked
        calculate your net pay, with consideration of overtime pay
            if you worked more than 40 hours you get overtime pay for the hours past 40.
             Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */

        double hourlyRate =20.5;
        double hoursWorked = 44;
        double netPay ;
        String message;

        if(hoursWorked> 40){
             double overTime = hoursWorked - 40;
             netPay=hourlyRate*40;
             netPay+=overTime*hourlyRate* 1.5;
            message = "You worked " + hoursWorked + " hours at a rate of " + hourlyRate + ", but " + overTime+ " of the hours were overtime, so you got an additional pay for those hours. Your net pay was $" + netPay;
        }else{
            netPay = hoursWorked*hourlyRate;
            message= "You worked " + hoursWorked+ " hours at a rate of " + hourlyRate + " there was no overtime. Your net pay was: $" + netPay;

        }
        System.out.println(message);

    }

}
