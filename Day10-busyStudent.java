class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0; 
        for(int i = 0; i<endTime.length; i++){
           // System.out.println(startTime[i] + "-" +endTime[i] + "-" + queryTime);
            
            if (startTime[i] <= queryTime && endTime[i] >= queryTime)
                count++; 
        }
        return count; 
    }
}
