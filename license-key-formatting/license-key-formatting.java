class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        int index = 0;
        s = s.toUpperCase();
        for(int i=s.length()-1;i>-1;i--){
            if(s.charAt(i) != '-'){
                sb.append(s.charAt(i));
                index ++;
                if(index == k){
                    sb.append('-');
                    index = 0;
                }
            }
        }
        while(sb.length() > 0 && sb.charAt(sb.length()-1) == '-'){
            sb.setLength(sb.length()-1);
        }
        
        return sb.reverse().toString();
    }
}