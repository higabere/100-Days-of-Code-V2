class Solution {
    public int countSegments(String s) {
        String [] arr = s.split(" ");
        int count= 0; 
        
        for(String a: arr)
            if(a.length()>0)
                count++; 
        return count;
    }
}
