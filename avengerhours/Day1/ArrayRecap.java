package Day1;

public class ArrayRecap {
    public static void main(String[] args) {
        int [] z = {2,6,6,6,6,1};

        int[] y = new int [4];
        y[0]=10;
        y[1]=20;
        y[2]=30;
        y[3]=40;

        int firstElement = z[0];
        int lastElement = z[z.length-1];

        if(firstElement == 6 || lastElement == 6){
            System.out.println(true);
        }else{
            System.out.println(false);
        }




    }
}
