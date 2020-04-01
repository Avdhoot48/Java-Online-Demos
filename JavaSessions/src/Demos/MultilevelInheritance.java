package Demos;
interface Parent1
{
    void show();
}
interface Parent2 extends Parent1
{
    int NUM=6;
}
public class MultilevelInheritance implements Parent2
{
    @Override
    public void show()
    {
        System.out.println("Value of num is: "+NUM);
    }
    public static void main(String[] args)
    {
        Parent2 par=new MultilevelInheritance();
        par.show();
    }
}
