package array;

import java.util.Arrays;

public class lesson1 {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        arr1 = new int[] {12,34,5,6,7,4,3,6,7};

        int[] arr2 = new int[10];
        arr2[0] = 22; arr2[1] = 59;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr1.length);
        System.out.println(arr2.length);
        

    }
}
