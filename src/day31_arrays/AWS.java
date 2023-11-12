package day31_arrays;

import java.util.Arrays;

public class AWS {
    public static void main(String[] args) {

        String app2 = "etsy";
        String zones = "us-east1,us-west1,us-west2,us-west3";

        String [] allZones = zones.split(",");

        for(int i=0; i< allZones.length; i++){
            System.out.println(app2 + " is deploying on " + allZones[i]);
        }

        }


    }

