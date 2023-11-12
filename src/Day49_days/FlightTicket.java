package Day49_days;

public class FlightTicket {
    /*
            constructor: initialize all fields
                -> only allow the given ticket types to be set

            encapsulate all the fields

     */
    private String type;
    private String DepartureLocation;
    private String ArrivalLocation;

    public FlightTicket(String type,String departureLocation, String arrivalLocation){
        setType(type);
        setDepartureLocation(DepartureLocation);
        setArrivalLocation(ArrivalLocation);

    }

    public void setType(String type){
        switch(type.toLowerCase()){
            case "first":
            case "business":
            case "company":
               this.type=type;
               break;

            default:
                System.out.println("Invalid entry");
        }
    }
    public String getType(){
        return type;
    }
    public String getDepartureLocation(){
        return getDepartureLocation();
    }
    public String getArrivalLocation(){
        return getArrivalLocation();
    }
    public void setDepartureLocation(String DepartureLocation){
        this.DepartureLocation=DepartureLocation;
    }
    public void setArrivalLocation(String ArrivalLocation){
        this.ArrivalLocation = ArrivalLocation;
    }

    @Override
    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", DepartureLocation='" + DepartureLocation + '\'' +
                ", ArrivalLocation='" + ArrivalLocation + '\'' +
                '}';
    }
}








