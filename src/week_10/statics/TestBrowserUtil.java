package week_10.statics;

import static week_10.statics.BrowserUtilits.*;

public class TestBrowserUtil {

    public static void main(String[] args) {
        open("http://google.com");

        close();

        refresh();
    }
}
