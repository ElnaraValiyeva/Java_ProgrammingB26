package Task;

import java.sql.Array;

public class UrlParts {
    public static void main(String[] args) {


        /*

        URL Parts

Given a url as follows, print each section of the url separated by the forward slash /

	Example:
		url = https://learn.cydeo.com/courses/130

	output:
		https:

		learn.cydeo.com
		courses
		130


         */
        String url ="https://learn.cydeo.com/courses/130";

        String  [] urlparts = url.split("/");

        for(String each: urlparts){
            System.out.println( each);
        }





    }
}
