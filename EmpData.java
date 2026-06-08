class Employee
{
    int id=592;
    static String name="pravalika";
    float salary=60000.23f;
    String email="ammu@gmail.com";
    String role="Dev";

    public static String display(){
        return name;
    }
}
class EmpData
{
    public static void main(String args[])
    {
        Employee e1 = new Employee();
        System.out.println(e1.display());
    }
}