package Arrays;

public class TrapedRailWaterProblem {

    public static int trappedWater(int[] arr) {
        
        int maxLeft[] = new int[arr.length];
        int maxRight[] = new int[arr.length];
        maxLeft[0] = arr[0];
        maxRight[arr.length-1] = arr[arr.length-1];
        
        for(int i=1; i<arr.length; i++){
            maxLeft[i] = Math.max(maxLeft[i-1], arr[i]);
        }
         for(int i=arr.length-2; i>=0; i--){
            maxRight[i] = Math.max(maxRight[i+1], arr[i]);
        } 

        int totalTrapedWater = 0;
        for(int i=0; i<arr.length; i++) {
            totalTrapedWater += Math.min(maxLeft[i], maxRight[i]) - arr[i];
        }

        return totalTrapedWater;
    }
    public static void main(String[] args) {
        int[] arr = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}
