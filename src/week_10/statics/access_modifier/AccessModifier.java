package week_10.statics.access_modifier;

public class AccessModifier {

    public String publicAccess;
    protected String protectedAccess;

    String defaultAccess;
    private String privateAccess;

    public static void main(String[] args) {


        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.defaultAccess);
        System.out.println(accessModifier.protectedAccess);
        System.out.println(accessModifier.defaultAccess);
        System.out.println(accessModifier.privateAccess);
    }

}
