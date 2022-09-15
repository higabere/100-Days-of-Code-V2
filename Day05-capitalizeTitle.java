class Solution {
    public String capitalizeTitle(String title) {
        String [] arrTitle = title.split(" ");
        String strAux = "", str = ""; 
        
        for(String a : arrTitle) {
            a = a.toLowerCase();
            
            strAux = (a.length() > 2) ? strAux.concat(a.substring(0,1).toUpperCase().concat(a.substring(1))) : strAux.concat(a); 
            strAux = strAux.concat(" "); 
        }
        return strAux.trim();        
    }
              
}
