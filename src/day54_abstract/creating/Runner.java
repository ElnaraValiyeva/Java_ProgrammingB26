package day54_abstract.creating;

public class Runner {
    public static void main(String[] args) {
        // Create obj = new Create();//can not make object of interfaces

        Book obj = new Book();// Book is a normal (non-abstract) class
        obj.read();
        obj.write();
    }

}

