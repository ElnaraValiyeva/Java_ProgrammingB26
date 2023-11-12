package Day45_custom_classes;

import Day43_CustomClass.OfferV2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {
        OfferV2 first = new OfferV2("Google","Texas",200_000, true,15);
        System.out.println(first);

        ArrayList<OfferV2> allOffers = new ArrayList<>();
        allOffers.add(first);
        System.out.println(allOffers);
        allOffers.add(new OfferV2("Amazon", "New York",180_000,true,17));

        System.out.println(allOffers);

        OfferV2 [] moreOffers = {
                new OfferV2("Apple","Chicago", 230_000,false, 10),
                new OfferV2("Tesla","Texas", 250_000, false,20)};
       allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);

       ArrayList<OfferV2> salariesc= new ArrayList<>(allOffers);
       salariesc.removeIf(each-> each.salary < 170_00);
        System.out.println("Salaries above 170,000");
        System.out.println(salariesc);



        }

    }


