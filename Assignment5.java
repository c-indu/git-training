public class Assignment5
{
    public static void main(String args[])
    {
        int arr[]={20,-1,50,39,100,5};
        
        
        Assignment5 as=new Assignment5();
        System.out.println(as.largestInArray(arr,arr.length));
    }
    public int largestInArray(int arr[],int n)
    {
        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    
    }
}

