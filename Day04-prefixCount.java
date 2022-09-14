class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0; 
        for(String a: words)
            if(a.startsWith(pref))
                count++; 
        return count; 
    }
}
