import java.util.Scanner;
class StudentGrade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if(marks>=91 && marks<=100)
        {
            System.out.println("O Grade");
        }
        else if(marks>=81 && marks<=90)
        {
            System.out.println("A+ Grade");
        }
        else if(marks>=71 && marks<=80)
        {
            System.out.println("A Grade");
        }
        else if(marks>=61 && marks<=70)
        {
            System.out.println("B+ Grade");
        }
        else if(marks>=51 && marks<=60)
        {
            System.out.println("B Grade");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}