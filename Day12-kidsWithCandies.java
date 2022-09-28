class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List <Boolean> listValue = new ArrayList<>();
        
        for(int x: candies)
            max = (x>max)? x:max;
        for(int i=0; i<candies.length; i++)
            if(candies[i]+extraCandies >= max)
                listValue.add(true);
        else
            listValue.add(false);
        
        return listValue;
    }
}
