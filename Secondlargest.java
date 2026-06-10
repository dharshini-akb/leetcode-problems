import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                secondlargest=largest;
                largest=arr[i];
            }
            else 
            {
            if(arr[i]>secondlargest && arr[i]!=largest)
            {
                secondlargest=arr[i];
            }
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Secondlargest:"+secondlargest);
    }
}