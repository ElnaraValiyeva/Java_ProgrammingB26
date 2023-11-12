package day20_foreach_31;

public class ForEachLoopPractice {
    
    public static void main(String[] args) {
        
        int [] numbers ={1,2,3,4,5,6,7};

        for(int each : numbers){

            if(each%2 !=0){
                System.out.println(each);
            }
        }
        
    }
    
}
