class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<words.length; i++)
            
            for(String a: words)
                if(!a.equals(words[i]) && a.contains(words[i]))
                    if(!list.contains(words[i])) list.add(words[i]);
        
        return  list;
    }
}
