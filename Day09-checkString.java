class Solution {
    public boolean checkString(String s) {
        int iAux = 0, index= 0;
        
        index = s.indexOf("b", index); 
        iAux = s.indexOf("a",index); 
        
        if(iAux > 0) return false; 
        return true; 
    }
}
