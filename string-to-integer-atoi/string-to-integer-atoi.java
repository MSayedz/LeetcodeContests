class Solution {
    public int myAtoi(String s) {
        boolean nigative = false;
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length() && s.charAt(i) == ' ')
            i++;
        if(i<s.length() && s.charAt(i) == '-'){
            nigative = true;
            i++;
        } else if(i<s.length() && s.charAt(i) == '+'){
            i++;
        }
        
        int result = 0; 
        
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if ((result > Integer.MAX_VALUE / 10) || 
                (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {        
                return nigative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            
            result = 10 * result + digit;
            i++;
        }
        
        return nigative ? result *-1 :result;
    }
}