class MouseAndCat
{
    public static void main(String args[])
    {
        int cat_a=12;
        int cat_b=3;
        int mouse_c=5;

        int res_a=Math.abs(cat_a - mouse_c);
        int res_b=Math.abs(cat_b - mouse_c);
        
        if(res_a < res_b)
        {
            System.out.println("cat A catch the mouse");
        }
        else if(res_b < res_a)
        {
           System.out.println("cat B catch the mouse"); 
        }
        else
        {
            System.out.println("mouse Escape");
        }
    }
}