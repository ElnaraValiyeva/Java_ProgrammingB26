package Day44_Custom_day;

public class EmployeeV2 {
    /*


    Make a class for Employee objects (from class)

    try to make an ArrayList of Employee objects
    maintain the list to have all the Employees that are SDET or Developer
    maintain a separate list of all the Employees who make over 100,000 salary
    find the max salary from the Employees
     */

    String name;
    int id;
    String jobTitle;
    double salary;



    public EmployeeV2(String name, String jobTitle){
        this.name=name;
        this.jobTitle=jobTitle;

    }

    public EmployeeV2(String name, int id, String jobTitle, double salary){
        this(name, jobTitle);
        this.id = id;
        this.salary = salary;
    }



    public void goToMeeting(){
        System.out.println(name + " is going to a meeting");
    }

    public String toString(){
        return name + " - " + jobTitle + " - " + id + " - $" + salary;

    }
}
