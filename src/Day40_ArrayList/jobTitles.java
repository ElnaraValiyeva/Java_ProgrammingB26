package Day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class jobTitles {
    public static void main(String[] args) {

        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("SDET", "Developer", "PO", "CEO","Dev OP", "QA"));
        System.out.println(allJobs);


        ArrayList<String> jobs1 = new ArrayList<>(allJobs);
        jobs1.removeAll(Arrays.asList("PO","CEO"));
        System.out.println(jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJobs);
        jobs2.retainAll(Arrays.asList("SDET","Developer","PO"));
        System.out.println(jobs2);


        ArrayList<String> jobs3 = new ArrayList<>(allJobs);
        System.out.println(jobs3.containsAll(Arrays.asList("Chef","CEO")));
        System.out.println(jobs3.containsAll(Arrays.asList("PO")));

    }
}
