package day_61maps;

import java.util.LinkedList;
import java.util.Queue;

public class Classroom {
    public static void main(String[]  args) {
        Queue<Integer> nums = new LinkedList<>();
        nums.offer(1);
        nums.add(2);
        nums.offer(4);
        System.out.println(nums.peek());
        System.out.println(nums);


       nums.poll();
        nums.remove();
        nums.poll();
        System.out.println(nums);
        System.out.println(nums.peek());
        System.out.println(nums.element());








    }






}
