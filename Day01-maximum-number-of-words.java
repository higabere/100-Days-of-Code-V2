public class Solution {
    public int mostWordsFound(String[] sentences) {
        int numMax = 0;
        for (String a : sentences){
            String[] num =  a.split(" ");
            numMax = numMax > num.length ? numMax : num.length;
        }
        return numMax;
    }
}
