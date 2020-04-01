package Demos;

public class EncapsulationDemo 
{
    private int num;
    private String val;
    public void getValue(int x)
    {
        num=x;
    }
    public int setValue()
    {
        return num;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
    
    public static void main(String[] args)
    {
        EncapsulationDemo demo=new EncapsulationDemo();
        demo.getValue(3);
        System.out.println(demo.setValue());
        demo.setVal("Avdhoot");
        System.out.println(demo.getVal());
    }
    
}
