import java.util.*;
import java.lang.*;

class eExcpHndl
{
    public static void main(String args[])
    {
      try
      {
        int a = 0/0;
      }
      catch(ArithmeticException e)
      {
        System.out.println("OOps! Can't divide by Zero");
      }
      finally
      {
        System.out.println("Hope you enjoyed the Results...");
      }

      try
      {
        throw new NullPointerException("ThrowTest");
      }
      finally
      {
        System.out.println("Here comes the Throw Results...");
      }
    }
}
