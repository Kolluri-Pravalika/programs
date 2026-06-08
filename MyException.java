class InSufficientFundsException extends Exception
{
    public InSufficientFundsException(String msg){
        super(msg);
    }
}
class BankExample{
    String name;
    int inbal;
    public BankExample(String name,int inbal){
        this.name=name;
        this.inbal=inbal;

    }
    public void withdraw(int amount) throws InSufficientFundsException{
        if(amount>inbal){
            throw new InSufficientFundsException("not having enough balance");
        }
        System.out.println("withdraw success");
        inbal-=amount;
        System.out.println("balance is :"+inbal);
    
    }
}

class MyException{
    public static void main(String args[]){
        BankExample obj = new BankExample("ammu",5000);
        try{
            obj.withdraw(2000);
        }
        catch(InSufficientFundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("thanku visit again");
        }
    }
}