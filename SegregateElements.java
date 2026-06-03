import java.util.*;
class SegregateElements
{
    public static void main(String args[])
    {
        int[] arr={4,14,7,22,39,89,56};
        ArrayList<Integer> odd_lis = new ArrayList<Integer>();
        ArrayList<Integer> even_lis = new ArrayList<Integer>();

        for(int ele:arr)
        {
            if(ele%2==0)
            {
                even_lis.add(ele);
            }
            else{
                odd_lis.add(ele);
            }
        }
        System.out.println(even_lis);
        System.out.println(odd_lis);
    }
}
