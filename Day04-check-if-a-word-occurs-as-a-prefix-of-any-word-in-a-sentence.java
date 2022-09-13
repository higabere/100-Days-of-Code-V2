class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String [] arr = sentence.split(" ");
        int count = 1;
        for(String a :arr){
            if (a.startsWith(searchWord))
                return count;
            count++;
        }
        return -1; 
    }
}
