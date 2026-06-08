class ExceptionEx2
{
    public static voiud main(String args[])
    {
        try{
            System.out.println(10/0);
        }
        catch(Exception e1){
            System.out.println("some other exception occured");
        }
        catch(ArithmeticException e){
            System.out.println("divide by 0");
        }
    }
}