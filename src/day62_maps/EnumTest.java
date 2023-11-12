package day62_maps;

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day=day;
    }

    public void tellItLikeItIs(){
        switch(day){
            case MONDAY:
                System.out.println("Mondays is bad");
                break;
            case TUESDAY:
                System.out.println("TUESDAY IS GOOD");
                break;

        }
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();
        EnumTest secondDay = new EnumTest(Day.TUESDAY);
        secondDay.tellItLikeItIs();

    }
}
