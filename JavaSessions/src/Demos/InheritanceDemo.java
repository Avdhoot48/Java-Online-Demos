package Demos;
import java.util.Scanner;
  class  Inherit2
{
    Scanner scanner=new Scanner(System.in);
    String name;
    String no;
    void getInfo()
    {
        System.out.println("Enter your name:");
        name=scanner.next();
        System.out.println("Enter your Contact no.:");
        no=scanner.next();
    }
    void displayInfo()
    {
        System.out.println("Name is:"+name);
        System.out.println("Contact no. is:"+no);
    }
    
}
 public class InheritanceDemo extends Inherit2
{
    Scanner scanner=new Scanner(System.in);
    String mail;
    void accept()
    {
        System.out.println("Enter your mail ID:");
        mail=scanner.next();
    }
    void show()
    {
        displayInfo();
        System.out.println("E-mail is:"+mail);
    }
    public static void main(String[] args)
    {
        InheritanceDemo in=new InheritanceDemo();
        in.getInfo();
        in.accept();
        in.show();
    }
          
}
