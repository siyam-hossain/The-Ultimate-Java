import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        5 is the array length
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=3;
        numbers[2]=5;
        numbers[3]=6;
        numbers[4]=9;

        String array = Arrays.toString(numbers);
        System.out.println("array: "+array);

//        new way initialize with value
        int[] numArrays = {3, 455, 653, 3432, 234, 231, 12};

        int length = numArrays.length;
        System.out.println("length: "+length);

        String arr = Arrays.toString(numArrays);
        System.out.println("Num array: "+arr);

        Arrays.sort(numArrays);
        System.out.println("sort: "+Arrays.toString(numArrays));

//        numbers[10]=10;

    }
}
