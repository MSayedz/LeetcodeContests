class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0;
        int[] count = new int[256];
        
        
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
            while(count[s.charAt(i)]>1){
                count[s.charAt(l++)]--;
            }
            max = Math.max(max,i-l+1);
        }
        
        return max;
    }
}