class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
//         char[] sChars = s.toCharArray();
//         char[] tChars = t.toCharArray();
        
//         Arrays.sort(sChars);
//         Arrays.sort(tChars);
        
//         return new String(sChars).equals(new String (tChars));
        
        int[] chars = new int[256];
        
        for(char cur:s.toCharArray()){
            chars[cur]++;
        }
        for(char cur:t.toCharArray()){
            if(chars[cur] > 0)
                chars[cur]--;
            else
                return false;
        }
        
        return true;
    }
}