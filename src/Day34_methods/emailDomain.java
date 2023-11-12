package Day34_methods;

public class emailDomain {
    public static void main(String[] args) {

        emailDom("Cydeo@gmail.com");

    }

    public static void emailDom(String domain){
        domain=domain.substring(domain.indexOf("@") +1,domain.indexOf("."));

        System.out.println("domain: " + domain);

    }
}
