import java.util.*;

class Invalidageexp extends Exception{
    Invalidageexp(String str_msg){
      super(str_msg);
    }
}
public class AgeException {
      public static void marry(int age){
        try{
        if(age<17){
            
            throw new Invalidageexp("your not valid to marry");
            
        }
        else{
            System.out.println("congratulation your valid to marry her");
            // return;

        }
    }    
       catch(Exception e){
        System.out.println("caught exception is:  "+ e);
    }
    
    // finally{
    // System.out.println("rest of code in finally block");
    //   }
      System.out.println("rest of code");

    }

      public static void main(String[]a){
           int age;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter your age");
           age=sc.nextInt();
           marry(age);
           System.out.println("rest of code in main method");

      }

}
