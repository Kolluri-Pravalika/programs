class FactorialRec
{
    public static int fact(int n)
    {
        
        if(n==1)  //base case
        return 1;
    
    //recursive call
    else{
        return n*fact(n-1);
        }
    }

    public static void main(String agrs[])
    {
        int n=5;
        System.out.println(fact(n));
    } 
}