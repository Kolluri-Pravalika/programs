class Employee
{
    String name;
    int id;
    float salary;
    String email;
    String role;
    static String company="Google";

    public Employee(String name,int id,float salary,String email,String role,String company)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.email=email;
        this.role=role;
        this.company=company;
    }
    public void displayDetails(){
        System.out.println("Name is "+this.name);
        System.out.println("Id is "+this.id);
        System.out.println("Salary is "+this.salary);
        System.out.println("Email is "+this.email);
        System.out.println("Role is "+this.role);
        System.out.println("Company is "+this.company);
    }
}
public class EmpData1
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("ammu",592,80000,"ammu@gmail.com","Dev","Infosys");
        e1.displayDetails();
    }
    }
