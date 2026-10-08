package Array;

import java.util.Arrays;

public class Q_10RightRotatebyK {
    public static void main(String[] args) {

        int arr[] = {3,6,1,3,7,8};
        int k = 3;
        int n = arr.length;

        for(int j=1;j<=k;j++){

            int temp = arr[n-1];
            for(int i= n-1;i>0;i--){
                arr[i] = arr[i-1];
            }
            arr[0]=temp;

        }
        System.out.println(Arrays.toString(arr));
    }
}
