package day64_65functional_interface.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMethods {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};//creating Streams
        Arrays.stream(arr);

        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,6,7,2));
        list.stream();
    }
}
