package Task;

public class UseEmployee {
    public static void main(String[] args) {
        EmployeeV2 employee1 = new EmployeeV2("Valiyeva Elnara", "SDET");
        employee1.goToMeting();
        System.out.println(employee1);
        System.out.println();

        EmployeeV2 employee2 = new EmployeeV2("Elnara Valiyeva",234567,"QA Enginer", 100000);
        employee2.goToMeting();
        System.out.println(employee2);

    }
}
