import java.util.Scanner;
class CheckPos
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n>0)
        {
            System.out.println("+ve");
        }
        else{
            System.out.println("-ve");
        }
    }
}