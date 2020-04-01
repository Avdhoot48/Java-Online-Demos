package Demos;

public class MethodLocalInnerClass 
{
    private int num=4;
    void create()
    {
        class Demo
        {
           void show()
           {
               System.out.println("Values from Parent class are:"+num);
           }
           
        }
        Demo demo=new Demo();
        demo.show();
    }
    public static void main(String[] args)
    {
        MethodLocalInnerClass inner=new MethodLocalInnerClass();
        inner.create();
    }
    
}
