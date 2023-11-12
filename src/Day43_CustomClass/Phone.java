package Day43_CustomClass;

public class Phone {
   /* name, brand, memory(16gb),version

        create constructors
                -accept and initialize the name */

    String name, brand;
    int memory;
    double version;

    public Phone(String name){
        this.name=name;
    }
    public Phone(String name, String brand){
        this.name=name;
        this.brand=brand;

    }
    public Phone (String name, String brand, int memory,double version){
        this.name=name;
        this.brand=brand;
        this.memory=memory;
        this.version = version;

    }


    @Override
    public String toString() {
        return "Phone information: " +
                "\nFhone name: " + name + "\nBrand: "
                + brand + "\nMemory: " + memory
                + "\nVersion: "+ version;
    }
}

