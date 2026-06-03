class Array
{
    public static void main(String args[])
    {
        int[] alice={1,2,7};
        int[] bob={9,2,3};

        int acount=0,bcount=0;

        for(int i=0;i<alice.length;i++)
        {
            if(alice[i] > bob[i])
            {
                acount++;
            }  
            else if(bob[i] > alice[i])
            {
                bcount++;
            }  
        }
        System.out.println("Alice count is "+acount);
        System.out.println("Bob count is "+bcount);
    }
}