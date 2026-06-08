class InvalidAgeException extends Exception{
    public InvalidAgeException(String args[])
    {
    super(msg);
    }
}
class VotingSystem
{
    public void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("not eligible for vote");
        }
        else{
            System.out.println("eligible for vote");
        }
    }
}

class UserException{
    public static void main(String args[]){
    VotingSystem vsobj=new VotingSystem();
    try{
    vsobj.checkAge(5);   
    }
    catch(InvalidAgeException e){
        System.out.println(e);
    }
}
}
