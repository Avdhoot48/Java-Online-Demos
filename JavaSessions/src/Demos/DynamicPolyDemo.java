package Demos;

class Parent
{
       int num;
    void show(int x)
    {
        num=x;
        System.out.println("Hello from parent class");
    }
     
}
public class DynamicPolyDemo extends Parent
{
       int number;
    void show(int number)
    {
        super.show(5);
        this.number=number;
        System.out.println("Hello from child class");
    }
    public static void main(String[] args)
    {
        DemoP demo=new DynamicPolyDemo();
        demo.show(4);
    }
    
}
