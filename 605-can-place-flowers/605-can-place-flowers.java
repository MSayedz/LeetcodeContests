class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                boolean prev = i==0? true: flowerbed[i-1] == 0;
                boolean next = i==flowerbed.length-1? true: flowerbed[i+1] == 0;
                if(prev && next){
                    n--;
                    flowerbed[i] = 1;
                }
            }
        }
        return n<1;
    }
}