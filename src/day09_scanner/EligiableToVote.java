package day09_scanner;

public class EligiableToVote {
    public static void main(String[] args) {
        int age = 30;
        String name = "Karlo";
        boolean iscitizen = true;
        boolean havecriminalbackground = false;
        boolean eligiablevote = age>18 && iscitizen &&!havecriminalbackground;
        System.out.println( name + "is aligiable vote: " + eligiablevote);


    }
}
