package Day49_inheritance;

public class App {
   public  String AppName;
   public  String Version;
   public App(String AppName, String Version){
      this.AppName=AppName;
      this.Version=Version;

   }
   public void download(){
      System.out.println(AppName + " is downloading version " + Version);


   }

   @Override
   public String toString() {
      return "App{" +
              "AppName='" + AppName + '\'' +
              ", Version='" + Version + '\'' +
              '}';
   }
}
