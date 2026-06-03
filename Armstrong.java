
class Armstrong
{
    public static void main(String args[])
    {
        int n=153;
        int temp1=n;
        int count =0,rem,temp=n;
        while(n>0)
        {
            rem=n%10;
            count++;
            n=n/10;
        }
        int sum=0,base;
        while(temp>0){
            base=temp%10;
            sum+=Math.pow(base,count);
            temp=temp/10;
        }
        if(sum==temp1)
        {
            System.out.println("Armstrong");
        }
        else{
        System.out.println("not Armstrong");
        }
    }
}