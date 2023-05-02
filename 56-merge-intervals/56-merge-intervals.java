class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> resList = new ArrayList<>();
        // int start = 0; 
        // int end = 0;
        // for(int i=0;i<intervals.length;i++){
        //     if(i == 0){
        //         start = intervals[i][0];
        //         end = intervals[i][1];
        //     }else{
        //         if(end >= intervals[i][0]){
        //             end = Math.max(end, intervals[i][1]);
        //         } else{
        //             resList.add(new int[] {start, end});
        //             start = intervals[i][0];
        //             end = intervals[i][1];
        //         }
        //     }
        //     resList.add(new int[] {start, end});
        // }
        
        for(int i = 0; i < intervals.length; i++){
            int[] tmp = intervals[i];
            while(i < intervals.length && intervals[i][0] <= tmp[1])
                tmp[1] = Math.max(tmp[1], intervals[i++][1]);
            
            resList.add(tmp);
            i--;
        }
        
        
        return resList.toArray(new int[0][0]);
    }
}