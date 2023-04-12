class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String str : path.split("/")) {
            if(str.equals("..")){
                if(!stack.isEmpty())
                    stack.pop();
            } else if(!str.equals(".") && !str.isEmpty()){
                stack.push(str);
            }
        }
        
        return "/"+String.join("/",stack);
    }
}