package Day_29_Array;

public class Initials {
    public static void main(String[] args) {
        String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        for(int i = 0; i < names.length;i++){

            String fullName = names[i].trim();
            String lastName =fullName.substring(fullName.indexOf(" ")).trim();
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

        }
    }
}
