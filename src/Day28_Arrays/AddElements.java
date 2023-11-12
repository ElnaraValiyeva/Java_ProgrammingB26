package Day28_Arrays;

public class AddElements {
    public static void main(String[] args) {

        int num [] = {3,6,10};
        int sum = 0;

        for (int i=0; i< num.length;i++)
            sum+=num[i];
 //       double overage = sum/num.lenght (print= owerage)
        System.out.println("The sum of: " + sum);
    }
}
