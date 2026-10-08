package Array;

import java.util.Arrays;

public class Q_8LeftRotatebyK {
    public static void main(String[] args) {

        int arr[] = {3,5,6,1,7,9};
        int n = arr.length , k = 3;

        for(int j=1;j<=k;j++){
            int temp = arr[0];
            for(int i = 1;i<n;i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
