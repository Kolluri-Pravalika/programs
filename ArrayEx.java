import java.util.Scanner;
class ArrayEx
{
    public static void main(String args[])
    {
        // int[] arr={10,4,5,6,2,3};
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++)
        {
        System.out.println(arr[i]);
        }
    }
}