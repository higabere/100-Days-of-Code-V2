class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String strW1 = "",strW2 = "" ; 
        
        for (String arrW1 : word1)
            strW1 = strW1.concat(arrW1);
        for (String arrW2 : word2)
            strW2 = strW2.concat(arrW2);
        
        if(strW1.equals(strW2))     
            return true; 
        return false; 
    }
}
