class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int temp=nums[i]+currentsum;
           if(nums[i]>temp)
           {
            currentsum=nums[i];
           }
           else
           {
            currentsum=temp;
           }
        
        if(currentsum>maxsum)
        {
            maxsum=currentsum;
        }
        }
        return maxsum;
    }
}