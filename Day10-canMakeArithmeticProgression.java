class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int k = 1, dif= arr[1] - arr[0];
        for(int i=0; i<arr.length-1;i++){
           
            if((arr[k] -arr[i]) != dif)
                return false;
            k++;
        }
        return true;
    }
}
