public class Main {
    public static void main(String[] args) {
        String role = "admin";

        switch (role){
            case "admin":
                System.out.println("You are admin");
                break;
            case "moderator":
                System.out.println("You are moderator");
                break;
            default:
                System.out.println("You are guest");
//                since it is the end of the switch therefore we don't need break
        }
    }
}
