package Demos;

public class AnonymousClassDemo 
{
    int num=7;
    void showString()
    {
        Object object=new Object(){
        public String toString()
        {
        
        return String.valueOf(num);
        }
        };
        System.out.println(object.toString());
    }
    public static void main(String[] args)
    {
        AnonymousClassDemo demo=new AnonymousClassDemo();
        demo.showString();
    }
 }