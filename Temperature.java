import java.util.Scanner;
class Temperature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("temp:? ");
        String temp = sc.next();

        if(temp.equals("high"))
        {
            System.out.println("NO");
        }
        else if(temp.equals("medium"))
        {
            boolean cloudy = sc.nextBoolean();
            if(cloudy==true)
            System.out.println("YES");
            else{
                System.out.println("YES");
            }
        }
        else if(temp.equals("low"))
        {
            boolean rainy = sc.nextBoolean();
            if(rainy==true)
            System.out.println("NO");
            else{
                System.out.println("YES");
            }
        }
            
    }
}