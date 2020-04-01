package Demos;

public class StaticDemo
{
    static int num;
    int number;
    static void disp()
    {
        num=5;
        System.out.println("Values of Static function: "+num);
    }
    
    void show()
    {
        num=4;
        number=5;
        System.out.println("Values of Non-Static function: "+number+" "+num);
    }
    public static void main(String[] args)
    {
        StaticDemo demo=new StaticDemo();
        demo.show();
        disp();
    }
    
}
