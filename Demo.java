abstract class Depositor {
   private int code;
   abstract void Credit();
   abstract void Debit();
   int bal;
   Depositor() {
      System.out.println("depositor details are printed");
      
   }
   public int balance()
   {
       System.out.println("remaining balance is printed");
       return bal;
   }
   
}
class Cr extends Depositor 
{ 
    void Credit() { 
  
        System.out.println("amount credited");
        //will add amount credited to balance
        System.out.println(balance());
       
    }
    void Debit() { 
  
        System.out.println("amount debitted"); 
        //will substract amount debitted from balance
        System.out.println(balance());
    }
   
}
public class Demo{
    public static void main(String[] args) 
    { 
        Depositor d1 = new Cr();
        d1.Credit();
        d1.Debit();
        
    } 
}