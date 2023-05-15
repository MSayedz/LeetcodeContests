class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(i == 0 || arr[i] != arr[i-1]){
                if(i != 0)
                    if(!set.add(count))
                        return false;
                count = 1;
            } else{count++;}
        }
        return set.add(count);
    }
}