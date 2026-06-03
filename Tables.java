import java.util.Scanner;
class Tables
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i;
    

        for(i=0;i<=10;i++)
            System.out.println(+n+"*"+i+"="+(n*i));
    }
}
