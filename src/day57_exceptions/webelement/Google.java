package day57_exceptions.webelement;

public class Google {
    public static void main(String[] args) {

        WebElement input = new Input();
        WebElement link = new Link();
        WebDriverUtil.clickElement(link);
        WebDriverUtil.clickElement(input);
    }


}
