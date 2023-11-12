package Day_13_03_22;

public class MyLogin {
    public static void main(String[] args) {

        boolean isLoginSuccess=login("ella","hello");

        if(isLoginSuccess){
            System.out.println("Welcome to CYDEO");
        }else{
            System.out.println("Check your password");

        }

        System.out.println("========");

        isLoginSuccess =login();

        if(isLoginSuccess){
            System.out.println("Welcome to Cydeo");
        }else{
            System.out.println("Check your password");
        }


    }

    public static boolean login(String useName, String  passWord){

        if(useName.equalsIgnoreCase("ella") && passWord.equalsIgnoreCase("hello")){
            return true;
        }
        return false;
    }

    public static boolean login(){

        String username = getUsername();
        String password =getPassword();

        if(username.equalsIgnoreCase("ella") && password.equalsIgnoreCase("hello")){

            return true;
        }
        return false;

    }

    public static String getUsername(){

        return "ella";
    }

    public static String getPassword(){
        return "hello";
    }
}
