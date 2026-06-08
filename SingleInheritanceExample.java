class Electronics
{
    public void turnOn(){
        System.out.println("Devices has turned on...");
    }
}

class SmartPhone extends Electronics{
    public void takeSelfi(){
        System.out.println("woow its nice pic!");
    }
}

class SingleInheritanceExample
{
    public static void main(String args[])
    {
        SmartPhone iphone = new SmartPhone();
        iphone.turnOn();
        iphone.takeSelfi();

        Electronics e = new Electronics();
        e.turnOn();
    } 
}