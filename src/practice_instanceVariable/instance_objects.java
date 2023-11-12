package practice_instanceVariable;

public class instance_objects {
    public static void main(String[] args) {

       instance_variable dog1 = new instance_variable();
       dog1.name="Max";

       instance_variable dog2 = new instance_variable();
       dog2.name = "Lucy";

        System.out.println(dog1.name);
        System.out.println(dog2.name);

        dog1.eat();
        dog2.sleep();



    }

}
