package week_12.T01_single_level.app_task;

public class TestApp {
    public static void main(String[] args) {

        Instagram instagram=new Instagram("1.1.1");
        instagram.postPhoto();
        instagram.download();

        Discord discord=new Discord("1.1.1");
        System.out.println(discord.appName);
    }
}
