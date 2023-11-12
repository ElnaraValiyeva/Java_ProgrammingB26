package Task;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Alper Arslan";
        String reverse2 =new StringBuilder(name).reverse()
                .toString();
        System.out.println(reverse2);

        System.out.println("--------");
        String str = "hello World";
        StringBuilder sb=new StringBuilder(str);
        System.out.println(sb.reverse());

        System.out.println("-----");

        char [] letters={'w','r','t','y','d'};

        printReverse(letters,5 );


    }

    public static String reverse2(String str){
        String reverse = "";
        for(int i = str.length()-1; i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }

    public static void printReverse(char[] letters, int size){
        for(int i = letters.length -1; i>=0;i--){
            System.out.print(letters[i]);
        }
    }




}
