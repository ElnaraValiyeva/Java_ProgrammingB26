package day_61maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,5,67,58,12,23));

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            if(it.next() < 5){
                it.remove();
            }
        }
        System.out.println(list);

    }
}
