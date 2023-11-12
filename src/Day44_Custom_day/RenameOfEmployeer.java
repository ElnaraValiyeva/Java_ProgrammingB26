package Day44_Custom_day;

import java.util.ArrayList;
import java.util.Arrays;

public class RenameOfEmployeer {
    public static void main(String[] args) {
        /*
        Make a class for Employee objects (from class)

    try to make an ArrayList of Employee objects
    maintain the list to have all the Employees that are SDET or Developer
    maintain a separate list of all the Employees who make over 100,000 salary
    find the max salary from the Employees

         */
        ArrayList<EmployeeV2> employee = new ArrayList<>();
        EmployeeV2 employer1 = new EmployeeV2("Elnara", 2345, "SDET",90000 );
        EmployeeV2 employer2 = new EmployeeV2("Alla",7890, "Developer", 120000);

        ArrayList<EmployeeV2>list1 = new ArrayList<>(Arrays.asList(new EmployeeV2[] {employer1, employer2}));
        System.out.println(list1);
        ArrayList<EmployeeV2>list2 = new ArrayList <>(Arrays.asList(new EmployeeV2[] {employer1,employer2}));
        System.out.println(list2);
        ArrayList<EmployeeV2> title = new ArrayList<>();
        for(EmployeeV2 each :employee ){
            if(each.jobTitle.equals("SDET")|| each.jobTitle.equals("Developer")){
                title.add(each);

            }
            System.out.println("The title is : " + title);

        }
        ArrayList<EmployeeV2> salary=new ArrayList<>();
        double salary1 =0;
        for(int i =0; i < employee.size(); i++){
            if(employee.get(0).salary > 100000);
            salary.add(employee.get(i));
        }
        System.out.println("The salary over 100,000 is: " + salary1);

        ArrayList<EmployeeV2> maxSalary = new ArrayList<>();
         Double max = 0.0;
         for(int i =0; i < employee.size(); i++){
             if(employee.get(i).salary < max){
                 max=employee.get(i).salary;
             }


         }
        System.out.println("The Max Salary is: " + max);





        }


    }

