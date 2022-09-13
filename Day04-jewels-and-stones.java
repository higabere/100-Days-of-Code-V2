class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char [] charJewel = jewels.toCharArray();
        
        for(char a : charJewel)
		for(int i=0; i<stones.length(); i++)
			if(stones.charAt(i) == a)
			count++;
	return count;
    }
}
