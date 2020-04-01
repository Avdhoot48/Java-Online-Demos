
package Demos;

public class PolyDemo
{
    void showVal(int...nums)
    {
        for(int n : nums)
        {
            System.out.println(n+"\t");
        }
    }
    public static void main(String[] args)
    {
        PolyDemo d=new PolyDemo();
        d.showVal(34,546,66);
        System.out.println();
        d.showVal(45,75,32,56,3);
        System.out.println();

    }  
}
