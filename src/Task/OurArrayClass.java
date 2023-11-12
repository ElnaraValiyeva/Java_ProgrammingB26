package Task;

public class OurArrayClass {

    /*

    all will accept array argument
    create a method that will print the first element
    create a method that will print thw last element
    create that will print th elements
       length matters -> even there is middle, for odd there is one middle



    public static void middleElement(int [] num){

    }
    public static void allElements(int [] num){
        System.out.println("First element: " + Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7};
        firstElement(num);
        lastElement(num);
        middleElement(num);
        allElements(num);
    }
     */

    public static void firstElement(int [] nums){
        System.out.println("First Element:" + nums[0]);
    }

    public static void lastElement(int []nums){
        System.out.println("Last Element: " + nums[nums.length-1]);
    }


    public static void middleElement(int [] nums){
        if(nums.length % 2 == 0){
            System.out.println("First Middle: "+ nums[nums.length/2-1]);
            System.out.println("Second Middle: " + nums[nums.length / 2]);

    }else{
            System.out.println("Middle: " + nums[nums.length/ 2]);
        }

     }

    public static void main(String[] args) {
        int [] numbers = {50, 0,10, 500, 20,40, 124};

        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);
    }
     }
