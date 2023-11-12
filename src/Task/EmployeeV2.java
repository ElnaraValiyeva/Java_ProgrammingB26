package Task;

public class EmployeeV2 {

   /*



    toString()
    print all the employees information

    Create a separate class to create and test the Employee objects
    */

        String name;
        long ID;
        String jobTitle;
        double salary;

        public EmployeeV2(String name, String jobTitle){
                this.name=name;
                this.jobTitle=jobTitle;
        }
        public EmployeeV2(String name,long ID, String jobTitle,double salary){
                this(name, jobTitle);
                this.ID = ID;
                this.salary=salary;
        }
        public  void goToMeting(){
                System.out.println(name + " is going to a meeting");


        }
        public String toString(){
                String result  = "Name: " + name + "\nJobtitle: " + jobTitle;
                if(ID !=0 ){
                        result+="ID: " + ID;
                }
                if(salary !=0){
                        result+= "Salary: " + salary;
                }
                return result;

        }





}
