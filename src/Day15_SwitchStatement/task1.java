package Day15_SwitchStatement;

public class task1 {
    public static void main(String[] args) {
        String browser = "google";
        String url = "www.google.com";
        switch (browser) {


            case "chrome":
                System.out.println("opening "
                        + url + "in the chrome browser");
                break;
            case "safari":
                System.out.println("opening " + url + "safari");
                break;
            default:
                System.out.println(browser + " is not a valid browser");
        }
    }
}


