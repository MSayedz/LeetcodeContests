class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        set.addAll(Arrays.asList('a', 'A', 'e', 'E','i', 'I','o', 'O','u', 'U'));
        int j=s.length()-1;
        int i=0;
        char[] c = s.toCharArray();
        while(i<j){
            while(i<j && !set.contains(c[i]))
                i++;
            while(i<j && !set.contains(c[j]))
                j--;
            
            char temp = c[i];
            c[i++] = c[j];
            c[j--] = temp;
        }
        
        return new String(c);
    }
}