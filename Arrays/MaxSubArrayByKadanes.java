package Arrays;

public class MaxSubArrayByKadanes {
    public static void main(String[] args) {
        int[] arr = { -3, -5, 4, -1, -2, 1, 5, -3 };
        int max = arr[0];
        int curr = arr[0];
        for(int i=1; i<arr.length; i++) {
            curr = curr + arr[i];
            if(curr <0) {
                curr = 0;
            }
            max= Math.max(max, curr);
        }

        System.out.println("Maximum subarray is " + max);
    }
}
