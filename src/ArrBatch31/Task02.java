package ArrBatch31;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);

        list.add(2,50);
        System.out.println(list);

        System.out.println("---------------------");
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Mohammad");
        studentList.add("Ella");

        System.out.println(studentList.size());
        System.out.println(studentList);

        System.out.println("---------------");

        String firstStudent = studentList.get(0);
        String lastStudent = studentList.get(studentList.size() -1);

        System.out.println(firstStudent);
        System.out.println(lastStudent);
    }
}
