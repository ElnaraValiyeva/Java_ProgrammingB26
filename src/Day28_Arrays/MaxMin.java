package Day28_Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int numbers [] = new int[]{500,120,-80, 90, 250, -10};
        int smallest = numbers[0];
        int biggest = numbers[0];

        for (int i=1; i< numbers.length; i++){
            if(numbers [i] > biggest)
                biggest=numbers[i];
            else if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        System.out.println("Largest num is: " + biggest);
        System.out.println("Smallest num is: " + smallest);


    }

}
