class Pattern
{
    public static void main(String args[])
    {
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print('*');
        //     }
        //     System.out.println();


            // int n=5;
            // for(int i=0;i<n;i++)
            // {
            // for(int j=0;j<n-i;j++)
            // {
            //     System.out.print('*');
            // }
            // System.out.println();
            // }        
        
        // int n=5;
        // for(int i=1;i<=n;i++)
        // {
        //     for(int j=1;j<=n;j++)
        //     {
        //         if(i==1 || j==1 || i==n || j==n)
        //             System.out.print("*");
        //         else
        //             System.out.print(' ');
        //     }
        //     System.out.println();
        // }
        
        
        // int n=5;
        // for(int i=1;i<n;i++)
        // {
        //     for(int j=1;j<n;j++)
        //     {
        //         if(i==0 || j==0 || i==n-1 || j==n-1)
        //             System.out.print("*");
        //         else
        //             System.out.print(' ');
        //     }
        //     System.out.println();
        // }


        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==n-1)
                    System.out.print("*");
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

}