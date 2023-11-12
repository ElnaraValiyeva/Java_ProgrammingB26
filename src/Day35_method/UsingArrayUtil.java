package Day35_method;

import MyLibrary.ArrayUtil;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int [] a = {3,1,6,12,7,1,20};
        System.out.println(ArrayUtil.minNumber(a));
        System.out.println(ArrayUtil.maxnumber(a));
        System.out.println(ArrayUtil.contains(a,12));
        System.out.println(ArrayUtil.contains(a,13));
    }


}
