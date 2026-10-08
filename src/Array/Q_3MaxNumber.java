package Array;

public class Q_3MaxNumber {
    public static void main(String[] args) {

        int arr[] = {4,7,6,9,1,2};

        int max = arr[0];
        int maxIndex = 0;

        for(int i =0; i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
                maxIndex = i;


            }
        }
        System.out.println("max number of arr" +max);
        System.out.println("Max index of arr" + maxIndex);
    }
}
