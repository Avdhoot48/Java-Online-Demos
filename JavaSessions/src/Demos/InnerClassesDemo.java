package Demos;
public class InnerClassesDemo 
{
    private int NUM=5;
    class DemoP
    {
       void showVal()
       {
           System.out.println("Values from Parent class are:"+NUM);
       }
    }
    DemoP demo=new DemoP();
    void disp()
    {
        demo.showVal();
    }
    public static void main(String[] args) 
    {
        InnerClassesDemo inner=new InnerClassesDemo();
        inner.disp();
    }
    
}
