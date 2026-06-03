import java.util.Scanner;
class Nestedif
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float cgpa = sc.nextFloat();
        if(cgpa>=7.5f)
        {
            int back=sc.nextInt();
            if(back<=2)
            {
                int coding=sc.nextInt();
                if(coding>=2)
                {
                    int comm=sc.nextInt();
                    if(comm>=60)
                    {
                        System.out.println("Eligible for placements");
                    }
                    else
                    {
                        System.out.println("Improve your comm skills");
                    }
                }
                else
                {
                    System.out.println("Sorry, you need to clear back");
                }
            }
            else
            {
                System.out.println("atmost 2 back");
            }
        }
        else{
            System.out.println("not eligible for placements");
        }
    }
}