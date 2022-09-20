class Solution {
    public String restoreString(String s, int[] indices) {
        char [] aux = new char[indices.length];  
        
        for(int i =0; i<indices.length; i++)
           aux[indices[i]] = s.charAt(i);
        
        String str = String.valueOf(aux);
        return str;
    }
}
