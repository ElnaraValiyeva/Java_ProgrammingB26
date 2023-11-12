package week_10.statics.constractor;

public class Cake {

    public static int numOfSlices=10;

    public  void eat(int slice){
        numOfSlices=numOfSlices-slice;
    }

}
