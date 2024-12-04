import java.util.*;

class Invalidageexp extends Exception{
    Invalidageexp(String str_msg){
      super(str_msg);
    }
}
public class AgeException_With_Throws {
      public static void marry(int age)throws Invalidageexp{
        
        if(age<17){
            
            throw new Invalidageexp("your not valid to marry");
            
        }
        else{
            System.out.println("congratulation your valid to marry her");
        }
         
        //  System.out.println("rest of code");
        
      }

      public static void main(String[]a)throws Invalidageexp{
           int age;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter your age");
           age=sc.nextInt();
          //  try{
           try{
           marry(age);    
      }
      
      catch(Exception e){
        System.out.println("caught exception is:  "+ e);
        throw new Invalidageexp("invalid age");
      }
      // }
      // catch(Exception e){
      //   System.out.println("second exception");
      // }
      finally{
        System.out.println(" code of finally block");
      }
      System.out.println("rest of code");

    //  if we handled all the threw exceptions in our code then rest of the code are always be execute
    // in this case we cannot differentiate between fibally block and rest of the code staements 
    // because rest of codes statements execution are full depending on handling all the exceptions

    // And if we dont handled all the threw exceptions [ its not matter you throw the exception in try block or not in your code but you must be handled the exception which is might be occured in our try block ]
// then the rest of code statement in our code will be not executed , while finally block can execute because
// finally block's execution are not depending on handling all the exception  



    }
}
