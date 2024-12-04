import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


 class OurException extends Exception{
    public OurException(String msg){
        super(msg);
    }
}
public class Exception1 {
           
    // static void mismch() {
    //     Scanner kb=new Scanner(System.in);

    //       try {
    //         int a = kb.nextInt();
    //         int b = kb.nextInt();
    //         int ans=a/b;
    //         System.out.println(ans);
    //     }
    //     catch(Exception ex){
    //         System.out.println("please provide int");

    //     //   throw new OurException("please provide int");

    //     }
    //     //System.out.println("Thanu");
    //     finally {
    //         System.out.println("Thanku");
    //     }
    //     System.out.println("Thanku rest of code");

    // }

    public static void main(String[] args) throws OurException {
        Scanner kb=new Scanner(System.in);

        try {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int ans=a/b;
            System.out.println(ans);
        }
        catch(InputMismatchException ex){
            throw new OurException("please provide int");
        }
        //System.out.println("Thanu");
        finally {
            System.out.println("Thanku finally block");
        }
       
        System.out.println("Thanku rest of code");
        // try{
        //  mismch();
    // }
    // catch(Exception ex){
    //     System.out.println("please provide int");
    //     }
        // System.out.println("rest code of main method");
    
    }
}