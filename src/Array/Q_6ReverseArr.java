package Array;

import java.util.Arrays;

public class Q_6ReverseArr {
    public static void main(String[] args) {

        int arr [] = {2,4,6,7,1};

//        for( int i = arr.length -1;i>=0;i--){
//            System.out.println( arr[i] + " ");
//        }

//        two pointer method

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end --;
        }
        System.out.println(Arrays.toString(arr));
    }
}
