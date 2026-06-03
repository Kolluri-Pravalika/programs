import java.util.Scanner;
class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ch=sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("INVALID CHOICE");
        }
    }
}