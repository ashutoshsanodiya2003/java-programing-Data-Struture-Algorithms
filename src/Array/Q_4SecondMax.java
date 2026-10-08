package Array;

public class Q_4SecondMax {
    public static void main(String[] args) {

        int arr [] = {7,5,6,3,8,1};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i]>secondMax){
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }
}
