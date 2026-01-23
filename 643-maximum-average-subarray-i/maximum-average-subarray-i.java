class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wind=0;
    int maxi=0;
        for(int i=0;i<k;i++)
        {
            wind=nums[i]+wind;
         
        }
          maxi=wind;
        for(int i=k;i<nums.length;i++)
        {
            wind=nums[i]+wind-nums[i-k];
             maxi=Math.max(maxi,wind);
        }
        return (double)maxi/k;
    }
}