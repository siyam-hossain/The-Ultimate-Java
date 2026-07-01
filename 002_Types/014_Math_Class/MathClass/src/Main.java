public class Main {
    public static void main(String[] args){
        int roundRes = Math.round(1.1F);
        System.out.println("Round result: "+roundRes);
        System.out.println("Ceil: "+Math.ceil(1.2F));
        System.out.println("Floor: "+Math.floor(1.9F));

        System.out.println("Max: "+Math.max(14, 3));
        System.out.println("Random: "+Math.random() * 100);
    }
}
