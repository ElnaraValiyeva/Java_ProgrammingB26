package week_11.encapsulation;

public class Teacher {


    private int age;
    private String name;

    public Teacher(int age, String name) {
       setAge(age);
       setName(name);
    }

    public void setAge(int age) {

        if(age<18){
            System.out.println("you can not assign age smaller 18");
            System.exit(0);
        }
        this.age = age;
    }

    public void setName(String name) {
        boolean isValidName=true;

        for (char c : name.toCharArray()) {

            if(!Character.isLetter(c)){
                isValidName=false;
            }
            if(!isValidName){
                System.out.println("You can not use that name as a name " + name);
                System.exit(0);
            }


        }

        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
