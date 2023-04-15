class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        
        for(int i=0;i<intervals.length;i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        
        Arrays.sort(starts);
        Arrays.sort(ends);
        
        int count = 0;
        for(int i=0,j=0;i<intervals.length;i++){
            count ++;
            if(starts[i]>=ends[j]){
                j++;
                count --;
            }
        }
        
        return count;
    }
}