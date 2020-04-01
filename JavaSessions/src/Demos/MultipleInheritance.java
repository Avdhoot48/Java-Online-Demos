package Demos;

interface Par1
{
    int NUM=4;
    Par1 demo=new MultipleInheritance();
    void get();
}
interface Par2
{
    int VAL=5;
    Par2 demo1=new MultipleInheritance();
    void get2();
}
public class MultipleInheritance implements Par1, Par2 
{   
    @Override
    public void get()
    {
        System.out.println("Value of Parent1 is:"+NUM);
    }
    @Override
    public void get2()
    {
        System.out.println("Value of Parent2 is:"+VAL);
    }
    public static void main(String[] args)
    {
        demo.get();
        demo1.get2();
    }
}
