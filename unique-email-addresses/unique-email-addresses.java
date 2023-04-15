class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for(String email:emails){
            String[] emailStr = email.split("@");
            String localName = emailStr[0].replace(".", "");
            if(localName.indexOf('+') != -1){
                localName = localName.substring(0, localName.indexOf('+'));
            }
            uniqueEmails.add(localName +"@"+ emailStr[1]);
        }
        
        return uniqueEmails.size();
    }
}