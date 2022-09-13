class Solution {
    public int balancedStringSplit(String s) {
        int countR=0,countL=0, k= 0, num=0 ;
        String[] newS = s.split("");
        
        for (String a: newS){
            k = a.equals("R")? ++countR: ++countL;
            if (countR == countL)
                ++num;
        }
        return num;
    }
}
