public class Main {
    public static void main(String[] args){
//        it is not primitive type
//        it uses the short hands of string literals
//        ********* Strings are immutable **********

        String message = "Hello world";
        System.out.println(message);

//        concatenation
        String name = "Siyam"+"Hossain!!";
        System.out.println(name);
        System.out.println("String ends with !!: "+name.endsWith("!!"));
        System.out.println("String index of e: "+name.indexOf('H'));
        System.out.println("String replace ! to @: "+name.replace("!","@"));
        System.out.println("Original string not changed: "+name);
        System.out.println("Lowercase: "+name.toLowerCase());

        String rmWhiteSpace = " Hello world ";
        System.out.println("Get rid of white spaces: "+rmWhiteSpace.trim());
    }
}
