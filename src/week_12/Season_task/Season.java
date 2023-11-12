package week_12.Season_task;

public class Season {


    public String name;
     double highTemperature;
     double lowTemperature;

    public Season(double highTemperature, double lowTemperature) {
        this.name = name;
        this.highTemperature = highTemperature;
        this.lowTemperature = lowTemperature;
    }

    public void activity(){
        System.out.println("Each season we are doing different activities");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highTemperature=" + highTemperature +
                ", lowTemperature=" + lowTemperature +
                '}';
    }
}
