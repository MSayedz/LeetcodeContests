class Solution {
    public String removeStars(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for(int i=0;i<s.length();i++){
            if('*' != s.charAt(i))
                deque.addLast(s.charAt(i));
            else if(!deque.isEmpty())
                deque.removeLast();
        }
        
        return deque.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }
}