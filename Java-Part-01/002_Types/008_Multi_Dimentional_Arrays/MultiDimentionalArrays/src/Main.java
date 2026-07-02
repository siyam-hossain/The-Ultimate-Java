import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[][] numbers = new int[2][3];

        numbers[0][0] = 1;
//        deep to string use while array declare as multidimensional
        System.out.println(Arrays.deepToString(numbers));

        int[][] numArray = {
                {1,3,4},
                {2,3,7}
        };
        System.out.println(Arrays.deepToString(numArray));
    }
}
