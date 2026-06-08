class ExceptionEx
{
    public static void main(String args[])
    {
        System.out.println("Hi");
        int a=10;
        int b=0;
        try{
        System.out.println(a/b);
        }
        catch(ArithmeticException ae){
            System.out.println("cannot divide by zero");
        }
        System.out.println("Bye");

        String s="bits";
        try{
        System.out.println(s.length());
        }
        catch(Exception e){
        System.out.println("Exception occured");    
        }
        finally{
            System.out.println("today is monday");
        }



    }
}