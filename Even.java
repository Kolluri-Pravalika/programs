class Even
{
    public static int evenArraySum(int nums[])
    {
        int sum = 0;//int pro=1;
        for(int ele:nums){
            if(ele%2==0){ //if(ele%2==1){
                sum+=ele; //pro*=ele;
            }
        }
        return sum; //return pro;
    }

    public static void main(String args[])
    {
        int[] nums={4,9,12,35,22,14};
        System.out.println("The even sum is" + evenArraySum(nums));
    }
}