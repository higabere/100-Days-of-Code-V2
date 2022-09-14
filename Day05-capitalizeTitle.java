class Solution {
    public String capitalizeTitle(String title) {
        String [] arrTitle = title.split(" ");
        String strAux = "", str = ""; 
        
        for(String a : arrTitle) {
            str = a.toLowerCase();
            
            strAux = (str.length() > 2) ? strAux.concat(str.substring(0,1).toUpperCase().concat(str.substring(1))) : strAux.concat(str); 
            strAux = strAux.concat(" "); 
        }
        return strAux.trim();        
    }
              
}
