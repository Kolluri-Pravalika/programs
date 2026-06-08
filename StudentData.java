class Student
{
    String name;
    int id;
    String email;

    public Student(String name,int id,String email)
    {
        this.name=name;
        this.id=id;
        this.email=email;
    
    }
    public void displayDetails(){
        System.out.println("Name is "+this.name);
        System.out.println("Id is "+this.id);
        System.out.println("Email is "+this.email);
        System.out.println("--------------");
    }
}
public class StudentData
{
    public static void main(String args[])
    {
        Student s1 = new Student("ammu",592,"ammu@gmail.com");
        Student s2 = new Student("akki",594,"akki@gmail.com");
        s1.displayDetails();
        s2.displayDetails();
    }
}
