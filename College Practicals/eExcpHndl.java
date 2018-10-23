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

    System.out.println();
    //Finalize
    eExcpHndl sample = new eExcpHndl();
    sample = null;

    System.gc();
    System.out.println("End of main");

    System.out.println();
    try
    {
      throw new NullPointerException("ThrowTest");
    }
    finally
    {
      System.out.println("Here comes the Throw Results...");
    }
  }

  public void finalize()
  {
    System.out.println("finalize method overriden!");
  }
}
