package Task;

public  class TestPerson {
    public static void main(String[] args) {

        Tester obj1 = new Tester();
        obj1.name="Elnara";
        obj1.age=35;
        obj1.jobTitle="QA Analytical";
        obj1.salary=120.000;
        System.out.println("Employer " + obj1.name + " age is " + obj1.age + " will get "
                + obj1.salary+ " salary" + " in the job " + obj1.jobTitle);
        obj1.hobby();
        obj1.work();
        System.out.println(obj1);

    }
}
