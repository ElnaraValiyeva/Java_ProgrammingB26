package Day42_Custom_clasess;

public class Employee {

    //first attribute

    int id;
    // second att
    int salary;
    // third att;
     String name;

     //Method 1

    public void printdetails(){
        //display message only

        System.out.println("my id is " + id);
        System.out.println("This is my name " + name);
    }

    //Method 2
    public int getSalary(){
         return salary;
    }
    //Method 3


    }
class Custom{
    public static void main(String[] args) {
        System.out.println("This is custom class");

        Employee harry = new Employee();
        Employee robin = new Employee();

        harry.id = 23;
        harry.salary = 5000;
        harry.name = "Ritu bhatiya";

        // initializing values
        robin.id = 24;
        robin.salary = 45;
        robin.name = "Amit Praksha";

        harry.printdetails();
        robin.printdetails();

        int salary = robin.getSalary();

        System.out.println("Salary of Robin: " + salary + "$");
        System.out.println("ID: " + harry.id);




    }




}
