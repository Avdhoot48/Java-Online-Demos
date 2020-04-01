package Demos;

class DemoPar
{
    final int num=4;
   final void disp()
    {
        System.out.println("Hwllo from parent class");
    }
}
public class FinalDemo extends DemoPar
{
    num=6;//Cant change since variable is declared as final
    void show()
    {
       
        System.out.println("The value of num from DemoP is:"+num);
    }
    @Override
    void disp()//Cant overide since method is declared as final
    {
        System.out.println("Hello");
    }
    
    public static void main(String[] args)
    {
        FinalDemo demo=new FinalDemo();
        demo.disp();
        demo.show();
    }
}
