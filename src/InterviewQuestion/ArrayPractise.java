package InterviewQuestion;
import java.util.Arrays;
public class ArrayPractise {
    public static void main(String[] args) {

        int [] numbers = {6,9,1};
        Arrays.sort(numbers);
        for ( int i =0; i<numbers.length;i++)
            System.out.println(numbers[i] + " ");

        System.out.println("==============");

        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for(String string: strings)
            System.out.println(string + " ");

        int[] num2 = { 2,4,6,8};
        System.out.println(Arrays.binarySearch(num2, 2));
        System.out.println(Arrays.binarySearch(num2,6));
        System.out.println(Arrays.binarySearch(num2,1));
        System.out.println((Arrays.binarySearch(num2,5)));
        }



    }



