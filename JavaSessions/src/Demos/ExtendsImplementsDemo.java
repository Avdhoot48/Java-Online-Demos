package Demos;
abstract class Part
{
    abstract void show();
    
}
interface Part1
{
    int NUM=9;
}
public class ExtendsImplementsDemo extends Part implements Part1
{
    
    @Override
    void show()
    {
        System.out.println("Hello "+NUM);
    }
    public static void main(String[] args)
    {
        ExtendsImplementsDemo demo=new ExtendsImplementsDemo();
        demo.show();
    }
}
