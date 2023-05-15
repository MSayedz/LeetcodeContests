class Solution {
    public int compress(char[] chars) {
        char cur = chars[0];
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<chars.length; i++){
            if(i == 0 || chars[i] != chars[i-1]){
                if(i!=0)
                    sb.append(cur);
                if(count>1)
                    sb.append(count);
                
                cur = chars[i];
                count = 1;
            } else {
                count++;
            }
        }
        
        sb.append(cur);
        if(count>1)
            sb.append(count);
        
        for(int i =0;i<sb.length(); i++){
            chars[i] = sb.charAt(i);
        }
        
        return sb.length();
    }
}