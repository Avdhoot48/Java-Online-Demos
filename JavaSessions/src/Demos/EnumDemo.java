
package Demos;


public class EnumDemo 
{
    enum COLORS{RED,PINK,GREEN};
    void showColor(COLORS color)
    {
        switch(color)
        {
            case RED:
                    {
                        System.out.println("You chose red color");
                    }
            break;
            case PINK:
                    {
                        System.out.println("You chose pink color");
                    }
            break;
            case GREEN:
                    {
                        System.out.println("You chose green color");
                    }
            break;
            default:
                break;
        }
    }
    public static void main(String[] args) 
    {
        EnumDemo demo=new EnumDemo();
        demo.showColor(COLORS.PINK);
    }
}
