class Solution {
    public boolean isSubsequence(String s, String t) {
        int[] counts = new int[26];
        int j=0;
        for(int i=0;i<t.length();i++){
            if(j>s.length()-1)
                return true;
            if(t.charAt(i) == s.charAt(j))
                j++;
        }
        
        return j>=s.length();
    }
}