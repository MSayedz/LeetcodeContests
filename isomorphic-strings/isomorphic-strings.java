class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        int[] sList = new int[256];
        Arrays.fill(sList, -1);
        int[] tList = new int[256];
        Arrays.fill(tList, -1);
        
        for(int i=0;i<s.length();i++){
            if(sList[s.charAt(i)] == -1 && tList[t.charAt(i)] == -1){
                sList[s.charAt(i)] = t.charAt(i);
                tList[t.charAt(i)] = s.charAt(i);
            }
            
            if(sList[s.charAt(i)] != t.charAt(i) || s.charAt(i) != tList[t.charAt(i)])
                return false;
        }
        
        return true;
    }
}