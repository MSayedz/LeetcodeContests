class Solution {
    public String removeStars(String s) {
        char[] res = s.toCharArray();
        int j = 0;
        for(int i = 0; i < res.length; i++, j++){
            res[j] = res[i];
            if(j > 0 && res[j] == '*') {
                j -= 2;
            }
        }
        return new String(res, 0, j);
        
//         Deque<Character> deque = new ArrayDeque<>();
        
//         for(int i=0;i<s.length();i++){
//             if('*' != s.charAt(i))
//                 deque.addLast(s.charAt(i));
//             else if(!deque.isEmpty())
//                 deque.removeLast();
//         }
        
//         return deque.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        
        // StringBuilder sb = new StringBuilder();
        // for (char c : s.toCharArray())
        //     if (c == '*')
        //         sb.setLength(sb.length() - 1);// sb.delectCharAt(sb.length() - 1);
        //     else
        //         sb.append(c);
        // return sb.toString();
    }
}