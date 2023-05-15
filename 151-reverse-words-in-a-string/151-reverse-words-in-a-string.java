class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=splitted.length-1;i>-1;i--){
            sb.append(splitted[i]).append(" ");
        }
        return sb.toString().trim();
    }
}