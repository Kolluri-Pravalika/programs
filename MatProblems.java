class MatProblems
{
    public static void main(String args[])
    {
        int[][] mat = {{10,20,30},{40,50,60},{70,80,90}};
        int rsum=0,lsum=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i+j==mat.length-1)
                // System.out.print(mat[i][j] + " ");
                //System.out.print(mat[j][i] + " "); transpose of matrix
                rsum+=mat[i][j];//sum+=mat[j][i];
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    lsum+=mat[i][j];
                }
            }
        }
            System.out.println(lsum+rsum);//diagonals

    }
}