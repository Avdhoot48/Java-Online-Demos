package Demos;
class Demop
{
       int num;
    Demop()
    {
        num=7;
    }
    Demop(int val)
    {
        num=val;
    }
    void disp()
    {
        System.out.println("Numbers of Paresnt class is: "+num);
    }
}
public class ConstructInvokInheritanceDemo extends Demop
{
    int number;
    ConstructInvokInheritanceDemo()
    {
        super();
        number=6;
    }
    ConstructInvokInheritanceDemo(int number,int x)
    {
        super(x);
        this.number=number;
    }
    void show()
    {
        super.disp();
        System.out.println("The numbers of child and parent are: "+number+" "+num);
    }
    public static void main(String[] args) 
    {
        System.out.println("Object created by no-arg constructor");
        ConstructInvokInheritanceDemo inherit=new  ConstructInvokInheritanceDemo();
        inherit.show();
        
        System.out.println("Object created by parameterised constuctor");
         ConstructInvokInheritanceDemo inherit1=new  ConstructInvokInheritanceDemo(8,9);
         inherit1.show();
    }
    
}
