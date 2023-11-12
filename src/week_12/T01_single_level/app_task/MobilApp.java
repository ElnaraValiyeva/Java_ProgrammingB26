package week_12.T01_single_level.app_task;

public class MobilApp {

    public String appName;

    public String version;

    public MobilApp(String appName, String version){
        this.appName=appName;
        this.version=version;

    }

    public void useApp(int minutes){
        System.out.println("You used that app for " + minutes + " minutes");
    }

    public  void download(){
        System.out.println(" You are download " + appName +" appName");
    }

    @Override
    public String toString() {
        return "MobilApp{" +
                "appName='" + appName + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
