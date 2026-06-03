import java.util.Scanner;
class MaxArray
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int[] arr={12,15,80,56,23,78};
        // int max=arr[0];
        // for(int i=1;i<arr.length;i++)
        // {
        //     if(arr[i] > max)        //if(arr[i] <  max) for min value
        //     {
        //         max=arr[i];
        //     }
        // }
        // System.out.println(max);

        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for (int ele : arr){
            if(ele>fmax)
            {
                smax=fmax;
                fmax=ele;
            }
            else if(ele > smax && ele!=fmax)
            {
                smax=ele;
            }
  
        }
        if(smax==Integer.MIN_VALUE);
        System.out.println(smax);

    }
}