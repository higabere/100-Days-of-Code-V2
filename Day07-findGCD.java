class Solution {
    public int findGCD(int[] nums) {
        int numMax = nums[0], numMin = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i] > numMax)
                numMax = nums[i]; 
            if(nums[i] < numMin)
                numMin = nums[i]; 
        }
        
        int modulo = numMax%numMin; 
        while (modulo != 0){
            numMax = numMin;
            numMin = modulo;
            modulo = numMax%numMin;
        }
        
       return numMin;
    }
}
