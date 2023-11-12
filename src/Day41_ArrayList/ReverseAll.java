package Day41_ArrayList;

import Day40_ArrayList.ArrayListWithMethods;
import MyLibrary.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>(Arrays.asList("Ted","Talk","Learn"));
        System.out.println(reverseAll(list));
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));

        }
    public static ArrayList<String> reverseAll(ArrayList<String>list){
        ArrayList<String> reverseWords = new ArrayList<>();
        for(String each  : list){

           reverseWords.add(StringUtil.reverse(each));
        }
        return reverseWords;
    }

}
