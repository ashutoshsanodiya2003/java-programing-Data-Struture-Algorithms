package Array;

import java.util.Arrays;

public class Q_9RightRotatebyOne {
    public static void main(String[] args) {

        int arr[] = {4,6,2,7,8};

        int temp = arr[arr.length-1];
        for(int i= arr.length-1;i>0;i--){
              arr[i] = arr[i-1];
        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
