package Demos;
abstract class AbstractClass
{
    abstract void show();
    abstract void showMsg();
    void display()
    {
        System.out.println("Hello from abstract class");
    }
}
class DemoP extends AbstractClass
{
    @Override
    void show()
    {
        System.out.println("Hello from overidden show()");
    }
    @Override
    void showMsg()
    {
        System.out.println("Hello from overidden showMsg()");
    }
}
abstract class DemoC extends AbstractClass
{
    void show()
    {
        System.out.println("Hello from extended Abstract class");
    }
}
public class AbstractionDemo extends DemoP
{
    void show()
    {
        System.out.println("Overridden method");
    }
    public static void main(String[] args) 
    {
         AbstractClass demo=new DemoP();
        demo.display();
        demo.show();
        demo.showMsg();
     
        System.out.println();
        
         AbstractClass demo1=new AbstractionDemo();
         demo1.display();
         demo1.show();
         demo1.showMsg();
    }
    
}
