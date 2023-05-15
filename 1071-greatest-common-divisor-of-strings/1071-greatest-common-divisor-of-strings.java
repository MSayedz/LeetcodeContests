class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    
    private int gcd(int i, int j){
        if(i == 0)
            return j;
        
        return gcd(j%i, i);
    }
}