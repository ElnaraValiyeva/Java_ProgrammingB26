package Day43_CustomClass;

public class OfferV2 {

    String location;
    String company;
    public double salary;
    boolean isFullTime;
    int numberOfPTO;



    public OfferV2(String company, String location){
        this.company=company;
        this.location=location;

    }
    public OfferV2(String location, String company, double salary) {
        this(company, location);
        this.salary = salary;
    }

    public OfferV2(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this(location,company);
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    public String toString(){
        String info =company + " located in:  " + location;
        info +="\n " + (salary > 0 ? salary : "");
        info +="\n " + (isFullTime ? "Full Time" : "Contract");
        info +="\n " + (numberOfPTO > 0 ? numberOfPTO : "");
        return info;

    }


}
