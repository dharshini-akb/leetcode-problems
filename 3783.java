class Solution{
    public int mirrorDistance(int n) {
        int t=n;
        int rev=0;
       while(t!=0)
       {
        int num=t%10;
        rev=rev*10+num;
        t=t/10;

       }
       int result=Math.abs(n-rev); 
       return result;
    }
}