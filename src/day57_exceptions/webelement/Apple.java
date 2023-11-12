package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {
        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();
        Image obj4 = new Image();

        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add((WebElement) obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add((WebElement) obj4);
        elements.add((WebElement) new Form());

        for(WebElement each : elements){
            System.out.println(each.getText());

            if(each instanceof Form){ // are you an object of Form

            }

        }
    }

}
