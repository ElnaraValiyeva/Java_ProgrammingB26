package Day_29_Array;

import java.util.Scanner;

public class Webcheker {
    public static void main(String[] args) {
        String[] url = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com",
                "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com",
                "comcast.net", "tamu.edu", "utexas.edu"};
        int com =0,org=0, edu=0,others = 0;

        for( int i=0; i< url.length; i++){

            if(url[i].contains(".com")){
                com++;
            }else if(url[i].contains(".org")){
                org++;
            }else if(url[i].contains(".edu")){
                edu++;
            }else if(url[i].contains(". ") &&!url[i].contains(".com") &&!url[i].contains(".edu")&& url[i].contains(".org")){
                others++;
            }

        }
        System.out.println("There are " + com + ".com domain name ");
        System.out.println("There are " + edu + ".edu domain name");
        System.out.println("There are " + org + ".org d0main name");
        System.out.println("There are " + others + " other domain name");





    }
}
