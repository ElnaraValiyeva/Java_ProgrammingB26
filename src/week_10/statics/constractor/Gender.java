package week_10.statics.constractor;

public class Gender {

    public String female;

    public int age;


    public Gender(){

    }

    public Gender(String female, int age){
        this(female);
        this.age = age;

    }
    public Gender(String female){
        this.female = female;
    }


}
